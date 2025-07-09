package 종합.심화과제1;

import java.util.Scanner;

public class BankService {//class s
    public static void main(String[] args) {//main s

        BankController controller = new BankController();

        for(;;){//(1) 무한루프 : 프로그램 계속적으로 실행하기 위해서
            System.out.println("============== KB Bank  ==============");
            System.out.println("1.계좌등록 | 2.입금 | 3.출금 | 4.잔고");
            System.out.println("======================================");
            System.out.println("선택 >");
            Scanner scan = new Scanner(System.in);
            int choose = scan.nextInt();
            if(choose ==1){// 입력에 따른 화면 출력
                System.out.println("--- 계좌 등록 ---");
                System.out.println("계좌번호 : ");
                String accountNum = scan.next();
                System.out.println("비밀번호 : ");
                String password = scan.next();
                System.out.println("[안내] 계좌 등록이 완료되었습니다.");
            }else if(choose == 2){
                System.out.println("--- 입금 ---");
                System.out.println("계좌번호 : ");
                String accountNum = scan.next();
                System.out.println("비밀번호 : ");
                String password = scan.next();
                System.out.println("입금액 : ");
                int pAdd = scan.nextInt();
                System.out.println("[안내] 입금이 완료되었습니다.");
            }else if(choose == 3) {
                System.out.println("--- 출금 ---");
                System.out.println("계좌번호 : ");
                String accountNum = scan.next();
                System.out.println("비밀번호 : ");
                String password = scan.next();
                System.out.println("출금액 : ");
                int pDeduct = scan.nextInt();
                System.out.println("[안내] 출금이 완료되었습니다.");
            }else if(choose ==4){
                System.out.println("--- 잔고 확인 ---");
                System.out.println("계좌번호 : ");
                String accountNum = scan.next();
                System.out.println("비밀번호 : ");
                String password = scan.next();
                System.out.println("[잔고] ");
            }
        }//for e
    }//main e
}//class e
