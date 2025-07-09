package day08;

public class Rectangle {
    //멤버변수
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    //메소드 :
    //1.메소드명 : getArea
    //2.매개변수 : x
    //3.반환값 : 곱하기 계산 결과, int result;
    int getArea(){//멤버변수(getArea() 메소드를 호출한 객체내)끼리 계산
        // 멤버변수 끼리 계산
        int result = width * height;
        //결과 반환
        return result;
    }//func e
}//class e
