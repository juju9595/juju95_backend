package day09;

public class BankAccount {
    //1. 멤버변수
    private String accountNumber;
    //2. 생성자
    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
    }

    //3. 메소드
    //1) getter

    public String getAccountNumber() {
        return this.accountNumber;
    }
}
