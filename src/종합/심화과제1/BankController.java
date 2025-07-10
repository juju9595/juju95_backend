package 종합.심화과제1;

public class BankController {

    Account[] accounts = new Account[100];


    boolean doPost(String accountNum, String password){
        Account account = new Account(accountNum, password);//(1)생성자를 이용한 객체 만들기
        for(int i=0; i <= accounts.length -1; i++){
            if(accounts[i] == null){//만약에 i번째 요소가 null이면
                accounts[i] = account; //i번째에 생성한 객체 대입
                return true;//return 이란 메소드 값 반환 이면서 메소드의 종료를 뜻한다.
            }
        }
        return false;//for 에서 null 이 존재하지 않을때 false 반환
    }

    int pAdd(){

    }

}
