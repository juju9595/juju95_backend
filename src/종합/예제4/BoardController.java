package 종합.예제4;

//BoardController : 로직/제어 담당
public class BoardController {
    //1. 멤버 변수
    Board[] boards = new Board[100];
    // 2. 메소드
    // 2-1 등록 메소드
    boolean doPost(String content, String writer) {
        Board board = new Board(); // -객체 생성
        board.content = content; // 매개변수로 받은 값들을 객체의 멤버 변수에 저장한다
        board.writer = writer;
        //board 배열의 빈 공간(null)을 찾아 생성된 객체를 저장합니다.
        for (int index = 0; index <= boards.length - 1; index++){
            if (boards[index] == null) {
                boards[index] = board;
                return true; //저장성공시 true
            }
        }
        return false; //실패(공간없음) 시 false 반환(return)
    }
    //boolean : 저장 성공 시 true, 실패(공간 없음) 시 false를 반환(return)
    //(String content, String writer) : 매개변수로 content와 writer를 받습니다.
    // 2-2 조회 메소드
    Board[] doGet(){
        return boards;
    }
    // boards 배열 전체를 반환(return)
    // boards 타입은 Board[]

}
