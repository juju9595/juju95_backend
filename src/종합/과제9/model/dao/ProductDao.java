package 종합.과제9.model.dao;

import 종합.과제9.model.dto.ProductDto;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

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

    // 전체 조회 기능 구현
    public ArrayList<ProductDto> productPrint(){
        ArrayList<ProductDto> list = new ArrayList<>(); // 조회된 레코드(DTO)들을 저장할 리스트 선언
        try{
            String sql = "select *from products";//SQL 작성
            PreparedStatement ps = conn.prepareStatement(sql); //SQL 기재
            ResultSet rs = ps.executeQuery(); //SQL실행
            //조회 결과를 레코드/행/가로단위 하나씩 조회
            while (rs.next()){
                int pno = rs.getInt("pno"); //rs.get타입
                String pname = rs.getString("pname");
                String pcontent = rs.getString("pcontent");
                String pprice = rs.getString("pprice");
                String pdate = rs.getString("pdate");
                int psale = rs.getInt("psale");
                String puser = rs.getString("puser");
                String ppassword = rs.getString("ppassword");
                ProductDto productDto = new ProductDto(pno,pname,pcontent,pprice,pdate,psale,puser, ppassword);
                list.add(productDto);
            }//while e
        } catch (Exception e) {
            System.out.println(e);
        }return list;
    }//func e

    // 수정 기능 구현
    public boolean productUpdate(ProductDto productDto) {
        try {
            String sql = "update products set ppassword =? pcontent=? pprice=? psale=? where pno=?" ;//sql작성
            PreparedStatement ps = conn.prepareStatement(sql); //sql 기재
            ps.setString(1, productDto.getPpassword());
            ps.setString(2, productDto.getPcontent());
            ps.setString(3, productDto.getPprice());
            ps.setInt(4, productDto.getPsale());
            ps.setInt(5,productDto.getPno());
            int count = ps.executeUpdate();//SQL 실행
            //sql 결과에 따른 로직/리턴/확인
            if (count == 1) return true;//수정 SQL 결과가 1이면 수정 성공
            return false;//결과가 1이 아니면 수정 실패
        } catch (Exception e) {
            System.out.println();
        }return false;//예외 발생시 수정 실패
    }


    // 삭제 기능 구현
    public boolean productDelete(int pno){
        try{
            String sql = "delete from products where pno =?"; //SQL 작성
            PreparedStatement ps = conn.prepareStatement(sql);//SQL 기재
            ps.setInt(1, pno);
            int count = ps.executeUpdate();
            if(count ==1){return true;} // <--sql결과가 1이면 성공
            else {return false;} // <--sql결과 1 아니면 실패
        }catch (Exception e){
            System.out.println(e);
        }return false; // <--예외발생시 삭제 실패
    }
}//class e
