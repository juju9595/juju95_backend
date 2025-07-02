package day04;

import java.util.Scanner;

public class Example1 {//class s
    public static void main(String[] args) { //main s

        /*
            [반복문]
                1. 조건에 따른 결과가 총족(true) 했을때 (반복)코드 실행
                2. 형태
                    for( 초기값 ; 조건문 ; 증감식 ){
                        실행문;
                    }
                    - 초기값 : 반복문에서 사용되는 변수 *주로 반복횟수                 , int i = 1;
                    - 조건문 : 반복변수의 조건문 *주로 반복횟수제한                   , i <=10;
                    - 증감식 : 반복변수의 증(가) 또는 감(소) 변화 식 *주로 반복횟수 증감, i++
                    - 실행문 : 조건 충족시 실행되는 코드/명령어;
                3. 실행순서
                    1) 초기값 -> 2)조건문 -> 3) 실행문 -> 4)증감식
                            -> 5)조건문 -> 6) 실행문 -> 7)증감식
                            ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                            -> !) 조건이 false 이면 반복문 종료
                4. for 중첩가능 : 상위 for문이 1회전 마다 하위 for문의 전체 회전
                    for(){
                        for(){}
                    }
                5. 주요 키워드 :
                    1) break;       : 가장 가까운 반복문 {} 종료/탈출       vs return
                    2) continue;    : 가장 가까운 반복문(증감식) 이동
                6. 무한루프
                    방법1) for( ;;){}
                    방법2) while(true){}

         */

        // [1] 1부터 5까지 출력
            // 반복문 : 1부터 5까지 1씩증가 , 인덱스 0부터 마지막인덱스까지 인덱스 1씩 증가
        for( int i = 1; i<=5 ; i++){
            System.out.println(i);
        }

        // [2] 중첩 : 구구단
            // 단 반복 : 2부터 9까지 1씩 증가.
        for(int 단 = 2; 단<=9; 단++){
            System.out.println(단);
        }
            // 곱 반복 : 1부터 9까지 1씩증가.
        for(int 곱 = 2; 곱<=9; 곱++){
            System.out.println(곱);
        }
            // 합치기 : (1) 단 마다 곱, (2) 곱 마다 단
        for(int 단 = 2; 단<=9; 단++){
            for(int 곱 = 2; 곱<=9; 곱++){
            System.out.printf("%d X %d = %d \n", 단, 곱, 단*곱);
            }//for2 end
        }// for1 end

        // [3] break : 1부터 10까지 출력, 만약에 5를 찾았으며 반복문 종료
        for(int index = 1 ; index<=10 ; index++){
            if (index == 5){break;}//만약에 현재 index가 5이면 가장 가까운 반복문{} 종료
            System.out.println(index);

        }//for end

        // [4] continue : 1부터 10까지 반복, 만약에 5를 찾았으면 출력 생략
        for(int index =1; index <=10; index ++){
            if(index == 5){continue;} // 만약에 현재 index가 5이면 가장 가까운 반복문(증감식)으로 이동
            System.out.println(index);
        }

        // [5] for( ; ; ){} : 무한반복 , 종료조건은 필요
        for(; ;){
        //while(true){
            System.out.println("무한입력 [종료:'x'] :");
            String input = new Scanner(System.in).next(); //키볻로부터 입력받아 저장
            if(input.equals("x")){break;} // 만약에 입력한 문자열이 "x" 이면 반복문 탈출, 무한루프 종료
        }//


    }//main e
}//class e
