package 종합.team0715.view;

import 종합.team0715.controller.MemberController;

public class MemberView {//class s
    private MemberView(){}
    private static final MemberView memberView = new MemberView();
    public static MemberView getInstance() {
        return memberView;
    }//public static MemberView end
    private MemberController memberController = MemberController.getInstance();
}//class e
