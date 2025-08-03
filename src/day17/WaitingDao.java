package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class WaitingDao {
    private static final WaitingDao instance = new WaitingDao();
    private WaitingDao(){
        connectDB();
    }
    public static WaitingDao getInstance(){
        return instance;
    }
    private String db_url = "jdbc:mysql://localhost:3306/mydb07222";
    private String db_user = "root";
    private String db_password = "1234";
    private Connection conn;

    public void connectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(db_url, db_user, db_password);
            System.out.println("데이터베이스 연동 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 연동 실패");
        }catch (SQLException e){
            System.out.println("데이터베이스 연동 실패");
        }
    }

}

