package day16;

import java.io.File;
import java.io.FileInputStream;

public class Example5 {//class s
    public static void main(String[] args) {//main s

        //예제2 : 공공데이터포털 에서 CSV 파일 다루기
        //CSV이란? 데이터들 간의 속성을 ,(쉼표) 구분하고 행 간의 \n 구분 한다.
        //1.https://www.data.go.kr/
        //2. '부평구 맛있는 집' 검색
        //3. "인천광역시 부평구_맛있는 집(맛집) 현황"
        //4. 상세 페이지 -> [다운로드]
        //5. 현재 패키지 저장(인천광역시 부평구_맛있는 집.csv)


        //(1) 파일 존재 여부 확인
        try{
            String path = "./src/day16/인천광역시 부평구_맛있는 집(맛집) 현황_20240801.csv";
        File file = new File( path);
        System.out.println(file.exists()); // 경로에 파일이 존재하면 true

            //(2) 존재하면 파일 읽어오기
            if(file.exists()){
                FileInputStream fin = new FileInputStream(path);// (3) 파일 입력 객체 생성
                byte[] bytes = new byte[(int)file.length()];//(5) 읽어온 바이트를 저장할 바이트 배열을 용량 만큼 선언
                fin.read(bytes);//(6) 바이트 읽어서 배열에 저장
                String str = new String(bytes,"Euc-KR");//(7) 읽어온 바이트를 문자열로 변환,
                // "EUC=KR" : 파일내(한국)인코딩 안될경우 String 생성자 인수로 추가
                System.out.println(str);
                //(8) *******************CSV 분해하기***********************
                //속성 구분 : ,(쉼표)     헹 구분 : \n
                //"문자열".split("구분문자");  : 지정한 구분문자 기준으로 쪼개서 배열 반환 함수
                System.out.println(str.split("\n")[0]); // 첫 행
                System.out.println(str.split("\n")[1].split(",")[1]);
                //--------------------------------------------------------
                String[] 헹데이터 = str.split("\n"); // 행 단위로 쪼개서 배열에 저장
                for(int i = 0; i <헹데이터.length; i++){
                    String row = 헹데이터[i];
                    //System.out.println(row);// 한 줄(행/row) 씩 출력
                    String[] 열데이터 = row.split(","); // 행을 열 단위로 쪼개서 배열에 저장
                    //System.out.println( 열데이터[1]);   //업소명
                    //System.out.println(열데이터[3]);    //지정메뉴
                    System.out.printf("업소명 : %s 지정메뉴 : %s, \n", 열데이터[1], 열데이터[3]);
                }
            }

        } catch (Exception e) {System.out.println(e);;}
    }//main e
}//class e
