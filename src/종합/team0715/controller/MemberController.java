package 종합.team0715.controller;

import 종합.team0715.model.dao.MemberDao;

public class MemberController {//class s
    //1)싱글톤
    private MemberController(){}
    private static final MemberController memController = new MemberController();
    public static MemberController getInstance() {
        return memController;
    } //public static MemberController end
    private MemberDao memberDao = MemberDao.getInstance();

    //
}//class e
