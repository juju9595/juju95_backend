package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class 실습15강사님 {
    public static void main(String[] args) {
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
    }
}
