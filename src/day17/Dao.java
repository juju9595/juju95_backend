package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Data Access Object : 데이터(데이터베이스/파일) 접근 객체
public class Dao {
    private static final Dao instance = new Dao();
    //(!) 싱글톤
    private Dao(){
        connectDB(); //Dao객체가 생성될때 db연동
    }
    public static Dao getInstance(){return instance;}
    //(!) DB연동 에 필요한 정보
    private String db_url = "jdbc:mysql://localhost:3306/mydb0722";
    private String db_user = "root";
    private String db_password = "1234";
    private Connection conn;    // DB연동 결과를 갖는 인터페이스
    // (1) 연동 함수
    public void connectDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // mysql 드라이버/클래스 로드 함수
            conn = DriverManager.getConnection(db_url, db_user, db_password);
            System.out.println("[시스템안내] 데이터베이스 연동 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("[경고] mysql 드라이버 연동 실패");
        } catch (SQLException e) {
            System.out.println("[경고] 데이터베이스 연동 실패");
        }
        // - 등록 함수

        // - 전체 조회 함수
    }
}//class e
