package 종합.과제3;

public class WaitingController {
    //1. Board 객체를 100개 저장할 수 있는 배열을 멤버 변수로 가집니다
    Waiting[] waitings = new Waiting[100];
    //2. 메소드
    //2-1 등록 메소드
    boolean addWaiting(String phone, String count){
        Waiting waiting = new Waiting();// -객체생성
        waiting.phone = phone; //매개변수로 phone과 count를 받습니다.
        waiting.count = count;
        //waitings 배열의 빈 공간(null)을 찾아 생성된 객체를 저장
        for(int i = 0; i <= waitings.length -1; i++){
            if(waitings[i] == null){
                waitings[i] = waiting;
                return true; // 저장성공시 true
            }
        }
        return false; //실패(공간 없음) 시 false를 반환(return)
    }
    //boolean : 저장 성공 시 true, 실패(공간 없음) 시 false를 반환(return)
    //(String phone, int count) : 매개변수로 phone과 count를 받습니다.
    //2-2 조회 메소드
    Waiting[] getWaiting(){
        return waitings;
    }
    //waitings 배열 전체를 반환(return)
    //waitings 타입은 Waiting[]
}
