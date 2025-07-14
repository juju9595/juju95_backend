package 종합.과제6.controller;

import 종합.과제6.model.dao.WaitingDao;
import 종합.과제6.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingController {
    //1)싱글톤
    private WaitingController(){}
    private static final WaitingController instance = new WaitingController();
    public static WaitingController getInstance(){
        return instance;
    }
    private WaitingDao waitingDao = WaitingDao.getInstance();

    //3)등록 기능 구현
    public boolean addWaiting(String phone, String count){
        boolean result = false;
        result = waitingDao.addWaiting(phone, count);
        return result;
    }
    //4) 전제조회 기능 구현
    public ArrayList<WaitingDto> getWaitingList(){
        return waitingDao.getWaitingList();
    }
}
