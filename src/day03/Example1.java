package day03;

public class Example1 { //class s
    public static void main(String[] args) {//main s
        /*
            조건문(IF)
                1. 조건에 따른 결과를 제어
                2. 종류
                    (1) if( 조건문 ) 참일대코드;
                    (2) if( 조건문 ){
                        참일때 명령어1;
                        참일때 명령어2;
                        }
                    (3) if( 조건문 ) { 참일때명령어;}
                        else{ 거짓일때명령어; }
                    (4) if( 조건문1 ) { 참1일때명령어; }
                        else if( 조건문2 ) { 참2일때명령어; }
                        else if( 조건문3 ) { 참3일때명령어; }
                        else { 거짓일때명령어; }
                    (5) if( 조건문1 ) { 참1일때명령어; }
                        if( 조건문2 ) { 참2일때명령어; }
                        if( 조건문3 ) { 참3일때명령어; }

                    (6) if( 조건문1 ){
                            if( 조건문2){ }
                            else{}
                         }else{
                         }

                    * 4번 : 여러 조건에 하나 결과 추출
                    * 5번 : 여러 조건에 여러 결과 추출

                3. 주의할점
                    (1) 조건문 자리에는 true/false 만 가능하다.
                    (2) { } 중괄호 관리
                    (3) if(); if소괄호 뒤에 ;세미클론 넣으면 안됌
                    (4) if, if~else, if~else if 하나의 결과

         */
        // [1] 참일때명령어가 1개이면 {} 생략 가능.
        int 온도 = 5;
        if(온도 <=10 ) System.out.println("외투를 입는다.");

        // [2] 참일때명령어가 (;세미클론)2개이면 무조건 {}로 묶어준다.
        int 나이 = 10;
        if(나이 >= 19){
            System.out.println("성인입니다.");
            System.out.println("19세 이상입니다.");
        }
        // [3] 참과 거짓으로 제어
        boolean 회원검사 = false;
        if(회원검사 == true){
            System.out.println("안녕하세요. 회원님");
        }else {
            System.out.println("비회원입니다.");
        }

        //[4] 다수조건일때 하나의 결과 추출
        int 지갑돈 = 1750;
        if( 지갑돈 >= 3000){
            System.out.println("택시를 탄다.");
        } else if (지갑돈 >= 1700) {
            System.out.println("버스를 탄다");
        } else if (지갑돈 >= 1200) {
            System.out.println("자전거를 탄다");
        }else {
            System.out.println("걸어 간다.");
        }
        //[5] 다수조건일때 여러 결과 추출
        if(지갑돈 >= 3000){
            System.out.println("택시를 탄다.2");
        }
        if(지갑돈 >= 1700){
            System.out.println("버스를 탄다.2");
        }
        if(지갑돈 >= 1200){
            System.out.println("자건거를 탄다.2");
        }
        //[6]
        int age = 25;
        char gender = 'w'; // 여자
        if( age >= 19 ){
            System.out.println("[성인]");
            if( gender == 'w'){
                System.out.println("[성인여자]");
            }else {
                System.out.println("[성인남자]");
            }
        }else{
            System.out.println("[미성년자]");
        }

    }//main e
}//class e


/*
    [조건문]
        1. 조건에 따른 결과(true/false)의 코드 흐름 제어
        *지갑의돈이 3000원 이상이면 택시탄다. 아니면 걸어간다.
            - 지갑의돈 >=3000 -> true 혹은 false
            - 삼항연산자 1) 지갑의돈 >= 3000 ? "택시탄다" : "걸어간다"
            - 조건문    2) if(지갑의돈 >=3000){"택시탄다";}else{"걸어간다";}
 */