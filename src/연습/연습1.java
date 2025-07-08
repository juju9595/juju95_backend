package 연습;

import java.util.Scanner;

public class 연습1 {//class s

    public static void main(String[] args) {//main s

        for(;;){
            System.out.println("=========== 맛집 대기 시스템 ==========="); //(2) 출력
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.println("선택 >");
            Scanner scan = new Scanner(System.in);
            int choose = scan.nextInt();
            if(choose == 1){
                System.out.print("전화번호 : ");
                String phone = scan.next();
                System.out.print("인원수 : ");
                int count = scan.nextInt();
            }
        }


    }//main e
}//class e
