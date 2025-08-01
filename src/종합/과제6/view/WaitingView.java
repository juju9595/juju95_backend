package 종합.과제6.view;

import 종합.과제6.controller.WaitingController;
import 종합.과제6.model.dto.WaitingDto;

import java.util.ArrayList;
import java.util.Scanner;

public class WaitingView {
    //1)싱글톤
    private WaitingView(){}
    private static final WaitingView instance = new WaitingView();
    public static WaitingView getInstance(){
        return instance;
    }
    //2) controller 싱글톤 가져오기
    private WaitingController waitingController = WaitingController.getInstance();

    //*모든 메소드에서 사용 가능한 Scanner 입력객체
    private Scanner scan = new Scanner(System.in);

    //*프로그램 최조 화면
    public void index(){
        for(;;){
            System.out.println("=========== 맛집 대기 시스템 ===========");
            System.out.println("  1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.println("선택 > ");
            int choose = scan.nextInt();
            if(choose ==1){addWaiting();}
            else if(choose ==2){getWaitingList();}
        }
    }

    //3) 등록 입출력 구현
    public void addWaiting(){

        System.out.println("전화번호 : "); String phone = scan.next();
        System.out.println("인원수 : "); String count = scan.next();
        boolean result = waitingController.addWaiting(phone, count);
        if(result == true){
            System.out.println("[안내] 대기 등록이 완료되었습니다.");
        }else{
            System.out.println("[경고] 대기 등록에 실패하였습니다.");}
    }

    //4) 전체 조회 입출력 구현
    public void getWaitingList(){

        ArrayList<WaitingDto> result = waitingController.getWaitingList();

        for(int i = 0; i< result.size(); i++){
            WaitingDto waiting = result.get(i);
            System.out.println("============= 대기 현황 =============");
            System.out.print("1. 연락처: "+waiting.getPhone());
            System.out.println(" - 인원: "+waiting.getCount()+"명");
            System.out.println("------------------------------------");
        }
    }
}
