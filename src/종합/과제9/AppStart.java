package 종합.과제9;

import 종합.과제9.controller.ProductController;
import 종합.과제9.model.dto.ProductDto;
import 종합.과제9.view.ProductView;

import java.util.ArrayList;

public class AppStart {
    public static void main(String[] args) {

        //등록 테스트
        boolean result = ProductController.getInstance().productWrite
                ("admin","콜라", "시원한콜라","1200","1234");
        System.out.println(result);

        //전체조회 테스트
        ArrayList<ProductDto> result2 = ProductController.getInstance().productPrint();
        System.out.println(result2);

        //*메인화면 호출
        ProductView.getInstance().index();
    }//main e
}// class e
