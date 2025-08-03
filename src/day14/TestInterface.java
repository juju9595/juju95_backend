package day14;

public interface TestInterface {

    //[6] 상수 , public static fianl, 생략가능
    // 주의할점 : 상수는 무조건 초기값이 있어야한다.
    int value2 = 10;
    int value3 = 20; // 상수 키워드 생략가능

    //[7] 추상메소드 : 선언부만 선언하고 실행문{}없는 메소드
    // abstract 반환타입 메소드();
    // 실행문{}은 각 클래스가 구현(오버라이딩) 한다.
    abstract void method2();
    boolean method3(int a); // 추상메소드 키워드 생략 rksmd

    //[3] 멤버변수 , **불가능**
    //int value1;

    //[4] 생성자 , **불가능**
    //TestInterface(){ }

    //[5]메소드, **불가능**
    //void method1(){}

}
