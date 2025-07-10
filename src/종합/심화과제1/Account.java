package 종합.심화과제1;

public class Account {
    //멤버변수
    String accountNum;
    String password;
    int balance;

    //생성자
    public Account(String accountNum, String password) {
        this.accountNum = accountNum;
        this.password = password;

    }
    //생성자
    public Account(int balance) {
        this.balance = balance;
    }
    //메소드
    boolean deposit(int money){
        balance += money;
        return true;
    }
}
