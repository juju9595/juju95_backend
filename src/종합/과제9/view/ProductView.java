package 종합.과제9.view;

import 종합.과제9.controller.ProductController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductView {
    //싱글톤
    private ProductView(){}
    private static final ProductView instance = new ProductView();
    public static ProductView getInstance(){
        return instance;
    }

    private Scanner scan = new Scanner(System.in);
    private ProductController productController = ProductController.getInstance();

    //메인화면
    public void index(){
        for(;;){
            try{
                System.out.println("==================Purchase List==================");
                System.out.println("1. 등록  |  2.조회  |  3.수정  |  4.삭제");
                System.out.println("==============================================");
                System.out.println("선택 > ");
                int choose = scan.nextInt();
                if(choose == 1){productWrite();}
                else if(choose == 2){}
                else if(choose == 3){}
                else if(choose == 4){}
                else {
                    System.out.println("[경고] 존재하지 않는 번호입니다.");}
            }catch (InputMismatchException e){
                System.out.println("[경고] 입력 타입이 일치하지 않습니다.");
                scan = new Scanner(System.in);
            }catch (Exception e){
                System.out.println("[오류] 관리자에게 문의");
            }
        }
    }

    //(1) 등록 화면 구현
    public void productWrite(){
        //입력받기
        scan.nextLine();
        System.out.println("판매자닉네임 : ");        String puser = scan.nextLine();
        System.out.println("물품명 : ");   String pname = scan.nextLine();
        System.out.println("설명 : ");    String pcontent = scan.nextLine();
        System.out.println("가격 : ");    String pprice = scan.nextLine();
        System.out.println("비밀번호 : "); String ppassword = scan.nextLine();
        //controller 전달하기
        boolean result = productController.productWrite(puser, pname,pcontent,pprice,ppassword);
        if(result){
            System.out.println("[안내] 등록 완료");
        }else {
            System.out.println("[안내] 등록 실패");
        }
    }//func e
}//class e
