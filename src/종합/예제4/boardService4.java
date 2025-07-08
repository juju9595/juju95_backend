package 종합.예제4;

import java.util.Scanner;
// rvice4 : 입출력
public class boardService4 {//class s

    public static void main(String[] args) {//main s


        //(5)
        // 1. content 와 writer 멤버변수를 갖는 객체 필요하므로 Board클래스 선언
        // 2. board 클래스 객체를 100개를 저장하는 배열을 controller 선언 *추후 : 데이터베이스 (외부저장소)
       //3. doPost() 와 doGet() 메소드를 호출하기 위한 객체 생성
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
                //(6) *doPost 메소드를 호출해서 등록 처리 후 결과를 반환
                boolean result = //doPost메소드가 실행후 결과를 result에 저장.
                bs.doPost(content, writer); // 입력받은 구 값을 인수로 전달
                if(result == true){ //doPost에서 true 반환이면
                    System.out.println("[안내] 글쓰기 성공");
                }else{// doPost에서 false 반환이면
                    System.out.println("[경고] 등록 실패");
                }
            }else if (choose ==2) {
                System.out.println("============= 게시물 목록 =============");
                Board[] boards = bs.doGet();
                // doGet()반환된 boards배열 재료를 boards에 대입한다
                for (int index = 0; index <= boards.length - 1; index++){
                    Board board = boards[index];

                    if(board !=null) {
                        System.out.println("작성자 : " + board.writer);
                        System.out.println("내용 : " + board.content);
                        System.out.println("------------------------------------------");
                    }
                }//for e
            }//if e
        }//for e
    }//main e
}//class e
