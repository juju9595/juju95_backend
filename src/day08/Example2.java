package day08;

class 학생설계도{
    //멤버변수 = 속성/상태/특징/데이터
    String name; //이름
    String lunchBox; //점심도시락

    //메소드 = 이벤트/행위/동작/사용법
    void 밥먹기(){
        System.out.println(name+"은"+ lunchBox+"먹습니다");
    }//f e
}//

public class Example2 {
    public static void main(String[] args) {
        // --16번째 줄 기준으로 클래스 1개, 객체 x

        학생설계도 s1 = new 학생설계도();
        s1.name = "유재석";
        s1.lunchBox = "신라면";
        // - 21번째 줄 기준으로 클래스 1개, 객체 1개
        학생설계도 s2 = new 학생설계도();
        s1.name = "강호동";
        s1.lunchBox = "김밥";
        // - 21번째 줄 기준으로 클래스 1개, 객체 2개

        s2.밥먹기(); //강호동은 김밥 먹습니다.
        s1.밥먹기(); //유재석은 신라면 먹습니다.

        //
        학생설계도[] 학생명단 = new 학생설계도[100];
        학생명단[0] = s1;

        //
        학생명단[0].밥먹기(); //유재석은 신라면 먹습니다.

        //
        int a = 3;
        int b = a;
        System.out.println(b);

    }// main e
}//class e
