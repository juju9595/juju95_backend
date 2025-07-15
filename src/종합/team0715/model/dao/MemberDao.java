package 종합.team0715.model.dao;

import 종합.team0715.model.dto.MemberDto;

import java.util.ArrayList;

public class MemberDao {//class s
    private MemberDao(){}
    private static final MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){
        return memberDao;
    }
}//class e
