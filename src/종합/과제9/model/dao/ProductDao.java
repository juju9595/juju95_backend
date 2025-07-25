package 종합.과제9.model.dao;

import 종합.과제9.model.dto.ProductDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductDao {
    //싱글톤
    private ProductDao(){connect();}
    private static final ProductDao instance = new ProductDao();
    public static ProductDao getInstance(){
        return instance;
    }
    //(*) DB 연동
    private String db_url = "jdbc:mysql://localhost:3306/sample95";
    private String db_user = "root";
    private String db_password = "1234";
    private Connection conn;
    private void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(db_url, db_user, db_password);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // 등록기능 구현
    public boolean productWrite(ProductDto productDto){
        try{
            String sql = "insert into products (puser,pname,pcontent,pprice,ppassword) values(?,?,?,?,?);";//SQL 작성한다.
            PreparedStatement ps = conn.prepareStatement(sql); //SQL 기재한다.
            // SQL 매개변수 대입, 현재 ? 5개
            ps.setString(1, productDto.getPcontent());
            ps.setString(2, productDto.getPcontent());
            ps.setString(3, productDto.getPcontent());
            ps.setString(4, productDto.getPcontent());
            ps.setString(5, productDto.getPcontent());
            //SQL 실행
            int count = ps.executeUpdate();
            if(count >= 1)return true;//1개 이상 insert 했으면 저장 성공
            return false; //1개 이상 insert 못했으면 저장 실패
        }catch (Exception e){
            System.out.println(e);
        }return false; // 예외 발생시 저장실패.
    }
}//class e
