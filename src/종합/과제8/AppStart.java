package 종합.과제8;

import 종합.과제8.controller.WaitingController;
import 종합.과제8.model.dto.WaitingDto;
import 종합.과제8.view.WaitingView;

import java.util.ArrayList;

public class AppStart {
    public static void main(String[] args) {

        //1.등록 테스트
        boolean result = WaitingController.getInstance().waitingWrite("010-1234-5678","6");
        System.out.println(result);

        //2.전체조회 테스트
        ArrayList<WaitingDto> result2 = WaitingController.getInstance().waitingPrint();
        System.out.println(result2);

        //3.특정삭제 테스트
        boolean result3 = WaitingController.getInstance().waitingDelete(2);
        System.out.println(result3);


        //*메인화면 호출
        WaitingView.getInstance().index();
    }
}
