package 종합.team0715.view;

import 종합.team0715.controller.MemberController;

import java.util.Scanner;

public class MemberView {//class s
    private MemberView(){}
    private static final MemberView memberView = new MemberView();
    public static MemberView getInstance() {
        return memberView;
    }//public static MemberView end

    //2) controller 싱글톤 가져오기
    private MemberController memberController = MemberController.getInstance();

    //*모든 메소드에서 사용 가능한 Scanner 입력객체
    private Scanner scan = new Scanner(System.in);

    public void index(){
        for(;;){
            System.out.println("=========== 도서관리 시스템  ===========");
            System.out.println("  1.회원가입 | 2.로그인");
            System.out.println("==========================================");
            System.out.println("선택 >");
            int choose = scan.nextInt();
            if (choose == 1) {signup();
            }else if (choose==2){login();}
        }
    }

    //3) 회원가입 등록 입출력 구현
    public boolean signup(){
        boolean result = false;
        return result;
    }

    //3) 로그인 등록 입출력 구현
    public boolean login(){
        boolean result = false;
        return result;
    }





}//class e
