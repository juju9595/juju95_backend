package 종합.과제9.controller;

import com.mysql.cj.util.DnsSrv;
import 종합.과제9.model.dao.ProductDao;
import 종합.과제9.model.dto.ProductDto;

public class ProductController {
    //싱글톤
    private ProductController(){}
    private static final ProductController instance = new ProductController();
    public static ProductController getInstance(){
        return instance;
    }

    //*productDao 싱글톤 가져오기
    private ProductDao productDao = ProductDao.getInstance();

    //등록 기능 구현 --> 주의할 점 매개변수와 동일한 생성자가 존재하지 않으면 오류 발생한다.
    public boolean productWrite(String puser, String pname, String pcontent, String pprice, String ppassword){
        ProductDto productDto = new ProductDto(0, pname,pcontent,pprice, null,0,puser,ppassword);
        //객체화 된 dto를 dao에게 전달 후 결과를 받는다.
        boolean result = productDao.productWrite(productDto);
        //결과를 view에게 리턴한다.
        return result;
    }
}
