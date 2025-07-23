package 종합.예제10.controller;

import 종합.예제10.model.dao.BoardDao;
import 종합.예제10.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardController {
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){
        return instance;
    }

    //(*) BoardDto 싱글톤 가져오기
    private BoardDao boardDao = BoardDao.getInstance();

    // (1) 등록 기능 구현
    public boolean boardWrite(String bcontent, String bwriter){
        //1. 여러가지 유효성 검사 (패스)
        //2. 데이터문제 없으면 묶음(객체)하나로 만들기
        // --> 주의할점 매개변수와 동일한 생성자가 존재하지 않으면 오류 발생한다.
        BoardDto boardDto = new BoardDto(0, bcontent, bwriter);
        //3. 객체화 된 dto를 dao에게 전달 후 결과를 받는다.
        boolean result = boardDao.boardWrite(boardDto);
        //4. 결과를 view에게 리턴한다.
        return result;
    }

    //(2) 전체조회 기능 구현
    public ArrayList<BoardDto> boardPrint(){
        //3. dao 에게 요청 후 결과 받기
        ArrayList<BoardDto> result = boardDao.boardPrint();
        //4. 결과를 view 에게 리턴한다.
        return result;
    }

    //(3) 삭제 기능 구현
    public boolean boardDelete(int bno){
        //3. dao에게 삭제할번호 전달 후 결과를 받는다.
        boolean result = boardDao.boardDelete(bno);
        //4. 결과를 view에게 리턴한다
        return result;
    }

    //(4) 수정 화면 구현
    public boolean boardUpdate(int bno, String bcontent){
    BoardDto boardDto = new BoardDto(bno, bcontent, null);
    boolean result = boardDao.boardUpdate(boardDto);
    return result;
    }
}//class e
