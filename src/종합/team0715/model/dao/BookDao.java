package 종합.team0715.model.dao;

import 종합.과제6.model.dao.WaitingDao;

public class BookDao {
    private BookDao(){}
    private static final BookDao bookDao = new BookDao();
    public static BookDao getInstance(){
        return bookDao;
    }
}
