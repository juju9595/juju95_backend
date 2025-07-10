package day08;

public class Goods {
    private String gName;
    //멤버변수
    String name;
    int price;

    //생성자1
    //기본생성자
    Goods(){
        name = "미정";//name "미정"
        price = 0;//price 0 초기화
    }

    //생성자2
    //매개변수
    Goods(String name, int price){//오버로드
        this.name = name; //this.멤버변수
        this.price = price;
    }

}
