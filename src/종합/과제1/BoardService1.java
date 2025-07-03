package 종합.과제1;

import java.util.Scanner;

public class BoardService1 {//class s
    public static void main(String[] args) {//main s
//[JAVA] 종합과제1 : 식당 대기번호 프로그램 (변수 활용)
//                [ 목표 ] Scanner, for(;;), if 문과 변수를 활용하여, 최대 3팀의 대기 명단을 관리할 수 있는 간단한 식당 대기번호 발행 프로그램을 구현합니다.
//[ 요구사항 ]
//        1. 대기 명단 저장 공간 만들기
//        · 최대 3팀의 대기 명단을 저장할 수 있어야 합니다.
//        · 각 대기 팀은 '전화번호'와 '인원수' 정보를 가집니다.
//        · 총 6개의 변수(String 3개, int 3개)를 선언하여 저장 공간을 만드세요. (예: phone1, count1, phone2, count2, phone3, count3)
//        · String 변수는 null로, int 변수는 0으로 초기화하여 해당 공간이 비어있음을 나타내도록 합니다.
//        2. 메인 프로그램 흐름 구현하기
//        · 프로그램은 24시간 운영을 가정하여 for(;;) 무한루프를 사용합니다.
//        · 무한루프 안에서 사용자에게 메뉴를 보여주고, Scanner를 통해 원하는 기능의 번호를 입력받으세요.
//        · 기능 1: 대기 등록 (입력값: 1)
//        - 사용자가 1을 입력하면, "전화번호 : "와 "인원수 : "를 순서대로 물어보고 입력받습니다.
//        - 1번 대기 공간(phone1)부터 순서대로 비어있는지(null인지) 확인합니다.
//                - 가장 먼저 발견된 빈 공간에 입력받은 전화번호와 인원수를 저장하고 "[안내] 대기 등록이 완료되었습니다." 메시지를 출력합니다.
//        - 만약 3개의 대기 공간이 모두 차 있다면, "[경고] 더 이상 대기 등록을 할 수 없습니다." 라는 메시지를 출력합니다.
//        · 기능 2: 대기 현황 보기 (입력값: 2)
//        - 사용자가 2를 입력하면, 현재 등록된 모든 대기 명단을 아래 형식으로 출력합니다.
//                - 1번 대기 공간부터 3번까지, 저장 공간이 비어있지 않은(null이 아닌) 경우에만 출력합니다.
//[ 실행 예시 ]
//=========== 맛집 대기 시스템 ===========
//1.대기 등록 | 2.대기 현황
//========================================
//선택 > 1
//전화번호 : 010-1234-5678
//인원수 : 2
//[안내] 대기 등록이 완료되었습니다.
//
//=========== 맛집 대기 시스템 ===========
//1.대기 등록 | 2.대기 현황
//========================================
//선택 > 1
//전화번호 : 010-8765-4321
//인원수 : 4
//[안내] 대기 등록이 완료되었습니다.
//
//=========== 맛집 대기 시스템 ===========
//1.대기 등록 | 2.대기 현황
//========================================
//선택 > 2
//============= 대기 현황 =============
//1. 연락처: 010-1234-5678 - 인원: 2명
// ------------------------------------
//2. 연락처: 010-8765-4321 - 인원: 4명
//------------------------------------
//
//=========== 맛집 대기 시스템 ===========
//1.대기 등록 | 2.대기 현황
//========================================
//선택 > 1
//전화번호 : 010-0000-0000
//인원수 : 3
//[경고] 더 이상 대기 등록을 할 수 없습니다.

        //step1 : 반복적인 메인(화면) 출력, 입력
        //step2 : 입력 선택에 따른 화면 출력
        //step3 : 기능별 필요한 메모리 설계
        //step4 : 각 기능별 세부 코드 구현
        String phone1 = null;   String phone2 = null;   String phone3 = null;
        String count1 = null;   String count2 = null;   String count3 = null;
        for(;;){//for s
            System.out.println("=========== 맛집 대기 시스템 ===========");
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.println("선택 >");
            Scanner scan = new Scanner(System.in);
            int choose = scan.nextInt();
            if(choose == 1){
                System.out.println("전화번호 :");   String phone = scan.next();
                System.out.println("인원수 :");    String count = scan.next();
                if(phone1 ==null){
                    phone1 =  phone; count1 = count;
                    System.out.println("[안내] 대기 등록이 완료되었습니다.");
                } else if (phone2 == null) {
                    phone2 = phone; count2 = count;
                    System.out.println("[안내] 대기 등록이 완료되었습니다.");
                } else if (phone3 == null) {
                    phone3 = phone; count3 = count;
                    System.out.println("[안내] 대기 등록이 완료되었습니다.");
                }else {
                    System.out.println("[경고] 더 이상 대기 등록을 할 수 없습니다.");
                }
            } else if (choose ==2) {
                System.out.println("============= 대기 현황 =============");
                if(phone1 != null){
                    System.out.print("1. 연락처:" +phone1);
                    System.out.println("- 인원:" +count1);
                    System.out.println("------------------------------------");
                }
                if(phone2 != null){
                    System.out.print("2. 연락처:" +phone2);
                    System.out.println("- 인원:" +count2);
                    System.out.println("------------------------------------");
                }
                if(phone3 != null){
                    System.out.print("3. 연락처:" +phone3);
                    System.out.println("- 인원:" +count3);
                    System.out.println("------------------------------------");
                }
            }//if e
        }//for e
    }//main e
}//class e
