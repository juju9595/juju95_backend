package 종합.과제3;

import java.util.Scanner;

public class 종합과제3 {
    public static void main(String[] args) {

        WaitingController controller = new WaitingController();

        for(;;){// (1) 무한루프 : 프로그램 무한 실행
            System.out.println("=========== 맛집 대기 시스템 ==========="); //(2) 출력
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.println("선택 >");
            Scanner scan = new Scanner(System.in);  //(3) 입력객체 생성
            int choose = scan.nextInt();
            if(choose ==1){ //(4) 입력에 따른 화면 출력
                System.out.print("전화번호 : ");
                String phone = scan.next();
                System.out.print("인원수 : ");
                int count = scan.nextInt();
                //(6)메소드 getWaitingList() 전체를 반환(return)
                boolean result = //addWaiting에서 true 반환이면
                        controller.addWaiting(phone, count); //입력받은 구 값을 인수로 전달
                if(result == true){// addWaiting true 반환이면
                    System.out.println("[안내] 대기 등록이 완료되었습니다.");
                }else{//addWaiting에서 false 반환이면
                    System.out.println("[경고] 더 이상 대기 등록을 할 수 없습니다.");
                }
            }else if(choose==2){
                System.out.println("============= 대기 현황 =============");
                Waiting[] waitings = controller.getWaiting();
                for(int i =0; i<= waitings.length -1; i++){
                    Waiting waiting = waitings[i];

                    if(waiting != null){
                        System.out.print("연락처: "+waiting.phone);
                        System.out.println("- 인원: "+waiting.count+"명");
                        System.out.println("------------------------------------");
                    }
                }//for e
            }//if e
        }//for e
    }//main e
}//class e
