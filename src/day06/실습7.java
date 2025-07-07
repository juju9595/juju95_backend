package day06;

import 종합.예제3.Board;

import java.awt.*;
import java.util.PrimitiveIterator;
import java.util.Scanner;

//=========1) .java 파일내 여러개 클래스 선언=========//
class Book{
    //멤버변수
    String title;
    String author;
    int price;


}
// class end
//JAVA] 실습7 : 클래스와 객체의멤버변수
//[ 문제 ] 아래 클래스와 멤버변수 관련 문제
//                [ 제출방법 ] 코드가 작성된 파일이 위치한 깃허브 상세 주소를 제출하시오.
//
//[문제 1] Book 클래스를 만드세요. 이 클래스는 title(문자열), author(문자열), price(정수) 멤버 변수를 가집니다.
//        1. main 함수에서 Book 객체 2개를 생성하세요.
//        2. 첫 번째 객체에는 "이것이 자바다", "신용권", 30000을, 두 번째 객체에는 "자바의 정석", "남궁성", 28000을 각각 저장하세요.
//        3. 두 객체의 모든 정보를 각각 출력하세요.
public class 실습7 {//class s
    public static void main(String[] args) {//main
        //* 자바에서 객체 생성하기 위해서는 *클래스* 필요하다.
        //1).java (실습7) 파일내 여러개 클래스 선언 (비권장)
        Book b1 = new Book();// (2) 객체 생성 한다, new 클래스명();
        Book b2 = new Book();// 주로 생성된 객체는 변수에 저장한다, 클래스명 변수명 = new 클래스명();
        b1.title ="이것이 자바다";//(3)"이것이 자바다", "신용권", 30000
        b1.author ="신용권";
        b1.price =30000;
        b2.title ="자바의 정석";//(3)"자바의 정석", "남궁성", 28000
        b2.author ="남궁";
        b2.price =28000;
        System.out.println(b1.title +"\t" +b1.author +"\t" +b1.price +"\t");//(4) 두 객체의 모든 정보를 각각 출력
        System.out.println(b2.title +"\t" +b2.author +"\t" +b2.price +"\t");


//[문제 2] Pet 클래스를 만드세요. name(문자열), species(문자열, 품종), age(정수) 멤버 변수를 가집니다.
//        1. main 함수에서 Pet 객체 2개를 생성하세요.
//        2. 첫 번째 객체에는 "초코", "푸들", 3을, 두 번째 객체에는 "나비", "코리안숏헤어", 5를 각각 저장하세요.
//        3. "이름: [이름], 종류: [품종], 나이: [나이]살" 형식으로 각 반려동물의 프로필을 출력하세요.
//
//        //2) 새로운 .java 파일 생성하여 클래스 선언
//        pet p1 = new pet();//(2) 객체 생성한다.
//        pet p2 = new pet();//클래스명 변수명 = new 클래스명();
//        p1.name = "초코"; p1.species = "푸들"; p1.age = 3;//(3) 첫 번째 객체에는 "초코", "푸들", 3
//        p2.name = "나비"; p2.species = "코리안숏헤어"; p2.age = 5;//(3) 두 번째 객체에는 "나비", "코리안숏헤어", 5
//        //(4) "이름: [이름], 종류: [품종], 나이: [나이]살" 형식 출력
//        System.out.printf("이름 :%s, 종류 : %s, 나이 : %d살 \n",
//                            p1.name, p1.species, p1.age);
//        System.out.printf("이름 :%s, 종류 : %s, 나이 : %d살 \n",
//                p2.name, p2.species, p2.age);


//[문제 3] Rectangle 클래스를 만드세요. width(정수)와 height(정수) 멤버 변수를 가집니다.
//        1. main 함수에서 Rectangle 객체를 하나 생성하고, width에 10, height에 5를 저장하세요.
//        2. 해당 객체의 width와 height 값을 곱하여 "사각형의 넓이: [넓이]"를 출력하세요.

        Rectangle r1 = new Rectangle(); // 객체 생성
        r1.width = 10; r1.height = 5;// 객체내 멤버변수에 값 대입
        System.out.printf("사각형의 넓이 : %d \n",
                            r1.width* r1.height);
//
//[문제 4] BankAccount 클래스를 만드세요. accountNumber(문자열), ownerName(문자열), balance(정수, 잔액) 멤버 변수를 가집니다.
//        1. main 함수에서 BankAccount 객체를 하나 생성하고, 계좌번호는 "111-222-3333", 예금주는 "유재석", 초기 잔액은 10000으로 저장하세요.
//        2. balance에 5000을 더하여 입금 상황을 구현하고, "입금 후 잔액: [잔액]"을 출력하세요.
//        3. 다시 balance에서 3000을 빼서 출금 상황을 구현하고, "출금 후 잔액: [잔액]"을 출력하세요.
        BankAccount account = new BankAccount(); //BankAccount 객체를 하나 생성
        account.accountNumber = "111-222-3333"; //계좌번호는 "111-222-3333"
        account.ownerName = "유재석"; //예금주는 "유재석"
        account.balance = 10000;//초기 잔액은 10000
        account.balance += 5000;//balance에 5000을 더하여 입금
        System.out.printf("입금 후 잔액 : %d \n", account.balance);//"입금 후 잔액: [잔액]"을 출력하세요.
        account.balance -= 3000;//다시 balance에서 3000을 빼서 출금
        System.out.printf("출금 후 잔액 : %d \n", account.balance);//"출금 후 잔액: [잔액]"을 출력하세요.
//
//[문제 5] Product 클래스를 만드세요. name(문자열)과 price(정수) 멤버 변수를 가집니다.
//        1. main 함수에서 Product 객체 2개를 생성하고, 각각 "새우깡", 1500과 "콜라", 2000 정보를 저장하세요.
//        2. if문을 사용하여 두 객체의 price를 비교하고, 더 비싼 상품의 이름을 출력하세요.
        Product prod1 = new Product();
        Product prod2 = new Product();
        prod1.name = "새우깡"; prod1.price = 1500; // 각각 "새우깡", 1500
        prod2.name = "콜라"; prod2.price = 2000; // 각각 "콜라", 2000
        if(prod1.price > prod2.price){
            System.out.printf(prod1.name);
        }else{
            System.out.println(prod2.name);
        }
//
//[문제 6] Member 클래스를 만드세요. id(문자열)와 isLogin(boolean) 멤버 변수를 가집니다.
//        1. main 함수에서 Member 객체를 하나 생성하고, 아이디는 "admin", isLogin은 false로 초기화하세요.
//        2. "로그인 전 상태: [isLogin 값]"을 출력하세요.
//        3. 객체의 isLogin 값을 true로 변경하여 로그인 상황을 구현하세요.
//        4. "로그인 후 상태: [isLogin 값]"을 출력하세요.
        Member mem1 = new Member();
        mem1.id = "admin"; mem1.isLogin = false;
        System.out.println("로그인 전 상태 : " + mem1.isLogin );
        mem1.isLogin = true;
        System.out.println("로그인 후 상테 : " + mem1.isLogin);


//
//[문제 7] Television 클래스를 만드세요. channel(정수)과 volume(정수) 멤버 변수를 가집니다.
//        1. main 함수에서 Television 객체를 생성하고, channel은 7, volume은 20으로 초기화하세요.
//        2. 객체의 channel 값을 11로 변경하고, volume 값은 2 감소시킨 뒤, 변경된 채널과 볼륨을 출력하세요.
//
        Television t1 = new Television();
        t1.channel = 7; t1.volume = 20;
        t1.channel = 11; t1.volume -= 2;
        System.out.printf("채널 : " + t1.channel);
        System.out.printf("채널 : " + t1.volume);
        System.out.println();

//[문제 8] Player 클래스를 만드세요. name(문자열), power(정수), speed(정수) 멤버 변수를 가집니다.
//        1. main 함수에서 Player 객체 2개를 생성하세요.
//        2. 첫 번째 객체에는 "손흥민", 90, 95를, 두 번째 객체에는 "이강인", 85, 92를 각각 저장하세요.
//        3. 두 객체의 power와 speed의 합을 각각 계산하고, 합이 더 높은 선수의 이름을 출력하세요.
//
        Player p1 = new Player();
        Player p2 = new Player();
        p1.name = "손흥민"; p1.power = 90; p1.speed = 95;
        p2.name = "이강민"; p1.power = 85; p1.speed = 92;
        if((p1.power + p1.speed) > (p2.power + p2.speed)){
            System.out.println(p1.name);
        }else{System.out.println(p2.name);}

//[문제 9] MenuItem 클래스를 만드세요. name(문자열), price(정수), isSignature(boolean, 대표메뉴 여부) 멤버 변수를 가집니다.
//        1. main 함수에서 MenuItem 객체 3개를 생성하고, 첫 번째는 "김치찌개", 8000, true,
//        두 번째는 "된장찌개", 8000, false,
//        세 번째는 "계란찜", 3000, false로 저장하세요.
//        2. if문을 사용하여 isSignature가 true인 메뉴 객체를 찾아, "[대표메뉴] [메뉴이름] : [가격]원" 형식으로 출력하세요.
//
        MenuItem m1 = new MenuItem();
        MenuItem m2 = new MenuItem();
        MenuItem m3 = new MenuItem();
        m1.name = "김치찌개"; m1.price = 8000; m1.isSignature = true;
        m2.name = "된장찌개"; m1.price = 8000; m1.isSignature = false;
        m3.name = "계란찜"; m3.price = 3000; m3.isSignature = false;

        MenuItem[] menuList = { m1, m2, m3 };

        for (MenuItem menu : menuList) {
            if (menu.isSignature) {
                System.out.println("[대표메뉴] " + menu.name + " : " + menu.price + "원");
            }
        }
//[문제 10] UserProfile 클래스를 만드세요. name(문자열), age(정수), mbti(문자열) 멤버 변수를 가집니다.
//        1. main 함수에서 UserProfile 객체를 하나 생성하세요.
//        2. Scanner를 사용하여 사용자로부터 이름, 나이, MBTI를 순서대로 입력받으세요.
//        3. 입력받은 값들을 생성된 객체의 각 멤버 변수에 저장하세요.
//        3. 모든 정보가 저장된 객체의 멤버 변수들을 가져와 "--- 프로필 ---", "이름: [이름]", "나이: [나이]", "MBTI: [MBTI]" 형식으로 출력하세요.

//        UserProfile u1 = new UserProfile();
//        System.out.println("이름: ");
//        System.out.println("나이: ");
//        System.out.println("MBTI: ");
//        u1.name =
    }//main e
}//class e
