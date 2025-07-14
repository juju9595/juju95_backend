package 종합.과제6.model.dao;

import 종합.과제6.model.dto.WaitingDto;
import 종합.과제6.view.WaitingView;

import java.util.ArrayList;

public class WaitingDao {
    //1)싱글톤
    private WaitingDao(){}
    private static final WaitingDao instance = new WaitingDao();
    public static WaitingDao getInstance(){
        return instance;
    }
    private ArrayList<WaitingDto> waitingDB = new ArrayList<>();

    public boolean addWaiting(String phone, String count){
        boolean result = false;
        WaitingDto waitingDto = new WaitingDto(phone, count);
        waitingDB.add(waitingDto);
        result = true;
        return true;
    }
    //4) 전제조회 기능 구현
    public ArrayList<WaitingDto> getWaitingList(){
        return waitingDB;
    }

}
