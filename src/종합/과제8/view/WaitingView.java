package 종합.과제8.view;

import 종합.과제8.controller.WaitingController;
import 종합.과제8.model.dto.WaitingDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WaitingView {
    private WaitingView(){}
    private static final WaitingView instance = new WaitingView();
    public static WaitingView getInstance(){
        return instance;
    }
    private Scanner scan = new Scanner(System.in);
    //(*)WaitingController 싱글톤 불러오기
    private WaitingController waitingController = WaitingController.getInstance();

    public void index(){

        for(;;) {
            try{
                System.out.println("=========== 대기 시스템 ===========");
                System.out.print("1.대기 등록 | 2.대기 현황 | 3.대기 취소 | 4.대기 정보 수정  선택> ");
                int choose = scan.nextInt();
                if (choose == 1) {waitingWrite();
                } else if (choose == 2) {waitingPrint();
                } else if (choose == 3) {waitingDelete();
                } else if (choose == 4) {waitingUpdate();
                } else {System.out.println("[경고] 존재하지 않는 번호입니다.");}
            }catch(InputMismatchException e){
                System.out.println("[경고] 입력 타입이 일치하지 않습니다.<다시입력>");
                scan = new Scanner(System.in);
            }catch(Exception e){
                System.out.println("[오류]관리자에게 문의하세요");
            }
        }
    }

    //(1)등록 화면 구현
    public void waitingWrite(){
        //입력받기
        scan.nextLine();
        System.out.println("> 전화번호: ");     String wphone = scan.nextLine();
        System.out.println("> 인원수: ");      String wcount = scan.next();
        boolean result = waitingController.waitingWrite(wphone,wcount);
        if(result){
            System.out.println("[안내] 대기 등록이 완료되었습니다.");
        }else {
            System.out.println("[안내] 대기 등록에 실패하였습니다.");
        }
    }//func e

    //(2)전체조회 화면 구현
    public void waitingPrint(){
        ArrayList<WaitingDto> result = waitingController.waitingPrint();
        System.out.println("============= 대기 현황 =============");
        System.out.println("no \t 전화번호 \t   인원수");
        System.out.println("------------------------------------");
        for(WaitingDto dto : result) {//향상된 for문, for(타입 변수명 : 리스트명){}
            System.out.printf("%d \t %s \t %s \n",
                    dto.getWno(), dto.getWphone(), dto.getWcount());
        }//for e
    }

    //(3) 삭제 화면 구현
    public void waitingDelete(){
        System.out.print("취소할 대기번호 : "); int wno = scan.nextInt();
        boolean result = waitingController.waitingDelete(wno);
        if (result) {
            System.out.println("[안내]취소 성공");}
        else {
            System.out.println("[경고]없는 번호이거나 실패");
        }
    }

    //(4) 수정 화면 구현
    public void waitingUpdate(){
        //입력받기
        System.out.println("수정할 대기번호 : "); int wno = scan.nextInt();
        scan.nextLine();
        System.out.println("수정할 인원수 : "); String wcount = scan.nextLine();
        //controller전달하기
        boolean result = waitingController.waitingUpdate(wno,wcount);
        if(result){
            System.out.println("[안내]수정 성공");
        }else {
            System.out.println("[경고]없는 번호 이거나 수정 실패");
        }
    }

}//class e
