package 종합.예제10.model.dao;

import 종합.예제10.model.dto.BoardDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.SimpleTimeZone;

public class BoardDao {
    private BoardDao(){connect();}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){
        return instance;
    }
    //(*)
    private String db_url = "jdbc:mysql://localhost:3306/exam10";
    private String db_user = "root";
    private String db_password = "1234";
    private Connection conn;
    private void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(db_url, db_user, db_password);
        }catch (Exception e){System.out.println(e);}
    }

    // (1) 등록기능 기능 구현
    public boolean boardWrite(BoardDto boardDto){
        // boolean              : 해당 메소드 실행 결과를 true(저장성공)false(저장실패) 반환 하기 위한 타입
        // BoardDto boardDto    : controller 로부터 저장할 값들을 dto로 구성해서 받는 매개변수
        try {
            // 1. SQL 작성한다.
            String sql = "INSERT INTO board( bcontent, bwriter) VALUES(?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);// 2. SQL 기재한다.
            // 3. SQL 매개변수 대입 , 현재 ? 2개
            ps.setString(1, boardDto.getBcontent()); // SQL내 1번 ? 에 매개변수로 받은 boardDto의 bcontent 값 대입
            ps.setString(2,boardDto.getBwriter());  // SQL내 2번 ? 에 매개변수로 받은 boardDto의 bwriter 값 대입
            // 4. SQL 실행
            int count = ps.executeUpdate();
            // 5. SQL 결과에 따른 로직/리턴/확인
            if( count >=1 ) return true; // 1개 이상 insert 했으면 저장 성공
            return false; // 1개 이상 insert 못했으면 저장 실패
        }catch (Exception e){System.out.println(e);}//catch e
        return false;// 예외 발생시 저장실패
    }//func e

    //(2) 전체조회 기능 구현
    public ArrayList<BoardDto> boardPrint( ) {
        // public 다른패키지의 Controller 가 접근하기 위해 public 다른패키지 접근 vs private 현재클래스만
        // ArrayList<BoardDto> : 배열 대신에 다양한 편의성 기을 제고하는 ArrayList 클래스

        ArrayList<BoardDto> list = new ArrayList<>();// 조회된 레코드(DTO) 들을 저장할 리스트 선언
        try{// 1.SQL 작성
        String sql = "select *from board";
        // 2.SQL 기재
        PreparedStatement ps = conn.prepareStatement(sql);
        // 3.SQL 매개변수 대입
        // 4.SQL 실행
            ResultSet rs = ps.executeQuery();
        // 5.SQL 결과에 따른 로직/리턴/확인
            //1) select 조회 결과 레코드/행/가로단위 하나식 조회
            while (rs.next()){//rs.next()) : ResultSet 인터페이스가 갖는 (조회)결과테이블에서 다음레코드 이동 뜻
                // rs.get타입("가져올속성명or번호")
                //2) 조회중인 레코드를 속성값 호출해서 dto 만들기
                int bno = rs.getInt("bno");
                String bcotent = rs.getNString("bcontent");
                String bwriter = rs.getNString("bwriter");
                BoardDto boardDto = new BoardDto(bno, bcotent, bwriter); // 레코드1개(열3개) --> DTO(멤버변수3개)
                // 3) 생성된 dto를 리스트에 담아주기
                list.add(boardDto);
            }

        }catch(Exception e){System.out.println(e);}
        return list;
    }

    //(3) 삭제 기능 구현
    public boolean boardDelete( int bno ){
        // int bno = 매개변수이면서 삭제할 게시물의 식별(pk)번호
        try{
            String sql = "delete from board where bno =?";// 1. SQL 작성
        PreparedStatement ps = conn.prepareStatement(sql);// 2. SQL 기재
        ps.setInt(1, bno);// 3. SQL 매개변수 대입
        // 4. SQL 실행 , insert/update/delete 문법 실행 결과는 처리된 레코드 수 반환
        int count = ps.executeUpdate();
        // 5. SQL 결과에 따른 로직/리턴/확인
        if(count == 1){return true;}
        else{return false;}
        }catch (Exception e){
            System.out.println(e);}
        return false;// <--- 예외발생시 삭제실패
    }

    // (4) 수정 기능 구현
    public boolean boardUpdate (BoardDto boardDto){
        try{
            String sql = "update board set bcontent = ? where bno =? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, boardDto.getBcontent());//.setString() 사용한이유 : bcontent가 문자열 이라서
            ps.setInt(2, boardDto.getBno()); // 2 작성한 이유 : SQL문법내 두번째 ? 자리
            int count = ps.executeUpdate();
            //5. SQL 결과에 따른 로직/리턴/확인
            if(count == 1) return true; // 수정 sql 결과가 1개 이면 수정성공
            return false; //
        }catch (Exception e){
            System.out.println(e);
        }
        return false;
    }
}//class e
