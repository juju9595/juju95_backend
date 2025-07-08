package day07;

public class Checker {
    boolean isEven(int x){
    //(int x) : 정수 하나를 매개변수로 받아
        if(x % 2 ==0){
            System.out.println("짝수입니다."); return true;
        }else {
            System.out.println("홀수입니다.");return false;
        }
    }//func e
}//class e
