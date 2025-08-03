package day16;


import java.io.*;
import java.util.Scanner;

public class 실습15 {//class s
    public static void main(String[] args) {//main s

        //***파일 처리 : 자바외 저장소로 영구저장 가능하다.***

//[JAVA] 실습15 : 파일 처리
//[ 문제 ] 아래 파일 처리 관련 문제를 해결하시오.
//[ 제출방법 ] 코드가 작성된 파일이 위치한 깃허브 상세 주소를 제출하시오.
//
//[문제 1] 파일에 일기 쓰기
//        1. FileOutputStream을 사용하여 src 폴더 내에 src/diary.txt 파일을 생성하세요.
//        2. "오늘 날씨는 맑았다. 자바 공부는 재미있다." 라는 문자열을 바이트로 변환하여 파일에 쓰세요.
//        3. try-catch를 사용하여 예외 처리하세요.
//
        //(1) 파일의 경로 지정
        String path = "./src/day16/diary.txt";
        try { // try{ 예외가 발생할것 같은 또는 일반예외 }
        //(2) 출력 객체 생성, 일반예외 발생 , try ~ catch
            FileOutputStream diary = new FileOutputStream(path);
        //(3) 출력할 내용
            String str = "오늘 날씨는 맑았다. 자바 공부는 재미있다.";
        //(4)
        byte[] outBytes = str.getBytes();
        //(5) 바이트 내보내기, 일반예외 발생, try~catch
        diary.write(outBytes);
        }catch (FileNotFoundException e){ // catch(예외클래스명 변수명){예외일때코드;}
            System.out.println("파일 또는 경로가 존재하지 않습니다."+ e);
        }catch (IOException e){
            System.out.println("입출력 도중에 오류가 발생했다" +e);
        }

//[문제 2] 파일에 작성된 일기 읽기
//        1. FileInputStream을 사용하여 문제 1에서 생성한 src/diary.txt 파일을 읽어오세요.
//        2. 읽어온 바이트 데이터를 String으로 변환하여 콘솔에 출력하세요.
        try {
            //(2) 입력 객체 생성
            FileInputStream diary = new FileInputStream(path);
            //(3) 가져올 바이트를 저장할 배열 선언(파일 크기만)
            File file = new File(path); // 파일객체
            byte[] inBytes = new byte[(int) file.length()];
            //(4) 읽어온 바이트를 배열에 저장, 일반에외 발생, try ~ catch
            diary.read(inBytes);
            //(5) 읽어온 바이트를 문자열로 변환
           String inStr = new String( inBytes);
        }catch (FileNotFoundException e){
            System.out.println("파일 또는 경로가 존재하지 않습니다."+ e);
        }catch (IOException e){
            System.out.println("파일 읽어오는데 문제가 발생했습니다"+e);
        }
//
//[문제 3] File 클래스로 파일 정보 확인하기
//        1. File 객체를 src/diary.txt 경로로 생성하세요.
//        2. .exists(), .getPath(), .getName(), .length() 메소드를 각각 사용하여 해당 파일의 존재 여부, 경로, 이름, 크기(바이트)를 출력하세요.
//        File file = new File(path);
//        System.out.println(file.exists());
//        System.out.println(file.getPath());
//        System.out.println(file.getName());
//        System.out.println(file.length());
////
//[문제 4] 방문 로그 누적 기록하기
//        1. FileOutputStream을 사용하여 src/visit_log.txt 파일을 여세요.
//        2. Scanner로 방문자 이름을 입력받아, "OOO님이 방문했습니다.\n" 형식의 문자열을 visit_log.txt 파일의 기존 내용 뒤에 추가하세요.
//        3. 프로그램을 여러 번 실행하여 방문 기록이 계속 누적되는지 확인하세요.
//
        try {
            Scanner scan = new Scanner(System.in); //입력받기
            System.out.print("방문자 이름 : ");
            String name = scan.next();
            //2.  문자열 연결 : +
            String outStr = name + "님이 방문했습니다.\n";
            //3. 파일 경로 지정
            String path1 = "./src/day16/visit_log.txt";
            //4. 지정 경로에 파일 존재여부 확인
            File file = new File(path1);
//            String inStr =""; //공백문자열
//            if (file.exists()) { // 파일 존재하면 // 입력
//                //5. 파일 입력 객체
//                FileInputStream fin = new FileInputStream(path1);
//                //6. 파일 용량 만큼 배열 선언
//                byte[] bytes = new byte[(int)file.length()];
//                //7. 읽어오기
//                fin.read(bytes);
//                inStr = new String(bytes); // 8.문자열로 변환
//            }
//            inStr += outStr; // 9. 불러온 문자열과 입력받은 문자열 연결
//            FileOutputStream foutput = new FileOutputStream(path1); //10. 출력객체
//            byte[] bytes = inStr.getBytes(); // 11. 바이트로 변환
//            foutput.write(bytes); //12. 바이트 내보내기
            FileOutputStream foutput = new FileOutputStream(path1, true);
            foutput.write(outStr.getBytes());
        }catch (Exception e){
            System.out.println(e);
        }

//
//[문제 5] 연락처를 CSV 형식으로 파일에 저장하기
//        1. Scanner를 사용하여 사용자로부터 이름, 전화번호, 사는 도시를 순서대로 입력받으세요.
//        2. 입력받은 데이터들을 쉼표(,)로 연결하여 하나의 String으로 만드세요. (예: "유재석,010-1234-5678,서울")
//        3. 해당 문자열을 contacts.csv 파일에 저장하세요. (줄바꿈 문자 \n 포함)
//
//
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("이름: ");
            String name = scan.next();
            System.out.println("전화번호: ");
            String phone = scan.next();
            System.out.println("사는 도시: ");
            String city = scan.next();

            String contact = name + "," + phone + "," + city + ",";

            String path2 = "./src/day16/contacts.csv";
            FileOutputStream fout = new FileOutputStream(path2);
            byte[] outByte = contact.getBytes();
            fout.write(outByte);
        }catch (Exception e){
            System.out.println("예외발생"+e);
        }






//[문제 6] 영화 감상평을 파일에 저장하기
//        1. Scanner를 사용하여 사용자로부터 좋아하는 영화 제목과 감상평을 한 줄로 입력받으세요.
//        2. 입력받은 내용을 src 폴더 내의 src/movie_review.txt 파일에 저장하세요.

//
//[문제 7] 저장된 감상평 파일 읽기
//        1. 문제 3에서 생성된 src/movie_review.txt 파일의 내용을 읽어오세요.
//        2. File 클래스의 .length()를 사용하여 파일 크기만큼 바이트 배열을 선언하고, 파일 전체를 한 번에 읽어오세요.
//        3. 읽어온 내용을 콘솔에 출력하세요.
//
//        try{
//        Scanner scan = new Scanner(System.in);
//        System.out.print("영화 제목과 감상평을 적어주세요:");
//        String str1 = scan.next();
//
//        String path4 = "./src/day16/movie_review.txt";
//
//        FileOutputStream fout3 = new FileOutputStream(path4);
//        byte[] outBytes = str1.getBytes();
//            fout3.write(outBytes);
//
//        File file3 = new File(path4);
//
//        if(file3.exists()){
//            FileInputStream fin = new FileInputStream(path4);
//            byte[] inByte = new byte[(int)file3.length()];
//            fin.read(inByte);
//
//            String[] 내용 = str1.split("\n");
//            for(int i = 0; i<내용.length; i++){
//                String row = 내용[i];
//                String[] 최종 = row.split(",");
//                System.out.printf("영화제목: %s, 감상평: %s, \n", 최종[0], 최종[1]);
//            }
//        }
//    }catch (Exception e){System.out.println(e);}

//[문제 8] 공공데이터 CSV 파일 읽고 분석하기
//        1. **공공데이터포털(data.go.kr)**에서 '부평구_인구현황'을 검색하여 CSV 파일을 다운로드하고, src 폴더에 bupyeong_population.csv 라는 이름으로 저장하세요.
//        2. FileInputStream을 사용하여 해당 파일을 읽어오세요. (주의: 한글 깨짐 방지를 위해 new String(bytes, "EUC-KR") 사용)
//        3. 읽어온 전체 내용을 줄바꿈(\n) 기준으로 분리하여 String 배열에 저장하세요.
//        4. for문을 사용하여 배열의 각 줄(각 동의 인구 정보)을 순회하며, '행정기관'과 '총인구수'만 추출하여 "동별: [ 동별 ], 총 인구: [ 인구수(계)   ]명" 형식으로 출력하세요.
        //(1) 파일 존재 여부 확인
            try {
                String path3 = "src/day16/인천광역시 부평구_인구 현황_20250131 (1).csv";
                File file = new File(path);

                //(2) 존재하면 파일 읽어오기
                if (file.exists()) {
                    FileInputStream fin = new FileInputStream(path3); //(3) 파일 입력 객체 생성
                    byte[] bytes = new byte[(int) file.length()];// 읽어온 바이트를 저장할 바이트 배열을 용량 만큼 선언
                    fin.read(bytes);//바이트 읽어서 배열에 저장
                    String str = new String(bytes, "EUC-KR");

                    String[] 행데이터 = str.split("\n"); // 행 단위로 쪼개서 배열에 저장
                    for (int i = 0; i < 행데이터.length; i++) {
                        String row = 행데이터[i];
                        //System.out.println(row);// 한 줄(행/row) 씩 출력
                        String[] 열데이터 = row.split(",");
                        //System.out.println( 열데이터[0]);   //동별
                        //System.out.println(열데이터[1]);    //총 인구
                        System.out.printf("동별: %s , 총 인구: %s명, \n", 열데이터[0], 열데이터[1]);
                    }
                }
            }catch (Exception e){
                System.out.println(e);}
    }//main e
}//class e
