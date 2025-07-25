package 종합.과제9.view;

import 종합.과제9.controller.ProductController;
import 종합.과제9.model.dto.ProductDto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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

    //*ProductController 싱글톤 불러오기
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
                else if(choose == 2){productPrint();}
                else if(choose == 3){productUpdate();}
                else if(choose == 4){productDelete();}
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

    //(2) 전체조회 화면 구현
    public void productPrint(){
        //controller에게 요청 후 결과 받기
        ArrayList< ProductDto> result = productController.productPrint();
        //결과에 따른 화면 구현,
        System.out.println("=============== 물품 목록 =================");
        for(ProductDto dto : result){ //향상된 for문
            System.out.println("제품번호 : "+dto.getPno());
            System.out.println("물품명 : "+dto.getPname());
            System.out.println("가격 : "+dto.getPprice());
            System.out.println("닉네임 : "+dto.getPuser());
            System.out.println("등록일 : "+dto.getPdate());
            System.out.println("판매여부 : "+dto.getPsale());
        }//for e
    }

    //(3)0 수정 화면 구현
    public void productUpdate(){
        //입력받기
        System.out.println("수정할 물품 : "); int pno = scan.nextInt();
        System.out.println("비밀번호 : "); String ppassword = scan.nextLine();
        scan.nextLine();
        System.out.println("물품명 : "); String pname = scan.nextLine();
        System.out.println("설명 : "); String pcontent = scan.nextLine();
        System.out.println("가격 : "); String pprice = scan.nextLine();
        System.out.println("판매여부 : "); int psale = scan.nextInt();
        boolean result = productController.productUpdate(pno,pname,ppassword,pcontent,pprice,psale);
        //리턴된 값에 따른 출력하기
        if(result){
            System.out.println("[안내] 수정 완료");
        }else {
            System.out.println("[경고]없는 번호이거나 수정 실패");
        }
    }

    //삭제 화면 구현
    public void productDelete(){
        System.out.print("삭제할 물품 : "); int pno = scan.nextInt();
        boolean result = productController.productDelete(pno);
        if(result){
            System.out.println("[안내] 삭제 성공");
        }else {
            System.out.println("[안내 없는 번호이거나 실패]");
        }
    }
}//class e
