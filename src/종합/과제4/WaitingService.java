package 종합.과제4;

import java.util.Scanner;

public class WaitingService {//class s

    public static void main(String[] args) {//class s

        for(;;){
            System.out.println("=========== 맛집 대기 시스템 ===========");
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.println("선택 >");
            Scanner scan = new Scanner(System.in);
            int choose = scan.nextInt();
            if(choose ==1 ) {
                System.out.println("전화번호 : ");
                String phone = scan.next();
                System.out.println("인원수 : ");
                String count = scan.next();
                boolean result = WaitingController4.addWaiting(phone, count);//클래스명.static메소드명();
                if (result) {
                    System.out.println("[안내] 대기 등록이 완료되었습니다.");
                } else {
                    System.out.println("[경고] 대기 등록에 실패하였습니다.");
                }
            }else if (choose == 2) {
                System.out.println("============= 대기 현황 =============");
                Waiting[] waitings = WaitingController4.getWaitingList();
                for(int i=0; i < waitings.length; i++){
                    Waiting waiting = waitings[i];
                    if(waiting != null) {
                        System.out.print("연락처: " +waiting.getPhone());
                        System.out.println(" - 인원: "+waiting.getCount()+"명");
                        System.out.println("------------------------------------");
                    }//if e
                }//for e
            }
        }//for e
    }//main s
}//class s
