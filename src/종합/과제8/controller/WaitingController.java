package 종합.과제8.controller;

import 종합.과제8.model.dao.WaitingDao;
import 종합.과제8.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingController {
    private WaitingController(){}
    private static final WaitingController instance = new WaitingController();
    public static WaitingController getInstance(){
        return instance;
    }

    //(*) waitingDao 싱글톤 가져오기
    private WaitingDao waitingDao = WaitingDao.getInstance();

    //(1) 등록 기능 구현
    public boolean waitingWrite(String wphone, String wcount){
        WaitingDto waitingDto = new WaitingDto(0,wphone,wcount);
        //객체화 된 dto를 dao에게 전달 후 결과를 받는다.
        boolean result = waitingDao.waitingWrite(waitingDto);
        //결과를 view에게 리턴한다.
        return result;
    }

    //(2) 전체 조회 기능 구현
    public ArrayList<WaitingDto> waitingPrint(){
        ArrayList<WaitingDto> result = waitingDao.waitingPrint();
        return result;
    }

    //(3) 삭제 기능 구현
    public boolean waitingDelete(int wno){
        boolean result = waitingDao.waitingDelete(wno);
        return result;
    }

    //(4) 수정 기능 구현
    public boolean waitingUpdate(int wno, String wcount){
        //객체화
        WaitingDto waitingDto = new WaitingDto(wno, null, wcount);
        //dao에게 삭제할 번호 전달 후 결과를 받는다
        boolean result = waitingDao.waitingUpdate(waitingDto);
        //결과를 view 에게 리턴한다.
        return result;
    }
}//class e
