package day08;

public class Goods {
    private String gName;
    //멤버변수
    String name;
    int price;

    //생성자1
    //기본생성자 name "미정", price 0 초기화
    Goods(){
        name = "미정";
        price = 0;
    }

    //생성자2
    //매개변수
    Goods(String name, int price){
        this.name = name;
        this.price = price;
    }

}
