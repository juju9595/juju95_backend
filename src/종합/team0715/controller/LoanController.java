package 종합.team0715.controller;

import 종합.team0715.model.dao.LoanDao;

public class LoanController {
    private LoanController(){}
    private static final LoanController loanController = new LoanController();
    public static LoanController getInstance(){
        return loanController;
    } //public static LoanController end
    private LoanDao loanDao = LoanDao.getInstance();
}
