package 종합.과제4;

public class WaitingController4 {

    //1.멤버변수

    private static final Waiting[] waitings = new Waiting[100];

    //2.생성자

    //3.메소드
    //1) 등록 메소드:
    //public 다른 클래스에서 접근
    public static boolean addWaiting(String phone, String count){
        Waiting waiting = new Waiting(phone, count);

        for(int i=0; i< waitings.length; i++){
            if(waitings[i] ==null){
                waitings[i] = waiting;
                return true; //저장성공 뜻을 1 부여하여 반환
            }//if e
        }//func e
        return false; //저장 실패 뜻을 false 로 부여하여 반환
    }//

    //2)조회 메소드

    public static Waiting[] getWaitingList(){
        return waitings;
    }
}//class e
