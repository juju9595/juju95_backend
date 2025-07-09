package 종합.예제5;

import java.util.Scanner;

public class boardService5 {//class s
    public static void main(String[] args) {//main s
        //*BoardController 클래스내 *메소드를 사용*하기 위한 객체 생성
        BoardController bs = new BoardController();

        for(;;) {// (1) 무한루프 : 프로그램 계속적으로 실행하기 위해서
            System.out.println("============= My Community ============="); //(2) 출력
            System.out.println("1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            System.out.println("선택 >");
            Scanner scan = new Scanner(System.in);  //(3) 입력객체 생성
            int choose = scan.nextInt();
            if (choose == 1) { //(4) 입력에 따른 화면 출력
                System.out.print("내용:");
                String content = scan.next();
                System.out.print("작성자:");
                String writer = scan.next();

                boolean result = bs.doPost( content, writer);
                if(result){
                    System.out.println("[안내] 글쓰기 성공");
                }else{
                    System.out.println("[경고] 글쓰기 실패");
                }

            }else if (choose ==2) {
            System.out.println("============= 게시물 목록 =============");
             Board[] boards =bs.doGet();
             for(int index =0; index<=boards.length-1; index++){
                 if(boards != null){
                     System.out.println("작성자 : ");
                     System.out.println("내용 : ");
                     System.out.println("------------------------------------------");
                 }
                }
            }//if e
        }//for e
    }//main e
}//class e

