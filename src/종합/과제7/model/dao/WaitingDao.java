package 종합.과제7.model.dao;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import 종합.과제7.model.dto.WaitingDto;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WaitingDao {
    //(*)싱글톤 : 지정한 클래스내 하나의 객체를 미리 만들고 프로그램내 하나의 객체만 존재
    private WaitingDao(){
        openCSV();// -- 싱글톤 생성시 csv 오픈
    }
    private static final WaitingDao instance = new WaitingDao();
    public static WaitingDao getInstance(){
        return instance;
    }
    // (*) DB 대신할 리스트 선언 < 추후에 사용하지 않음>
    ArrayList<WaitingDto> waitingDB = new ArrayList<>();

    // (1) 등록
    public boolean waitingWrite(WaitingDto waitingDto){
        waitingDB.add(waitingDto); // 1. 리스트(db)에 DTO를 저장한다.
        saveCSV(); // * CSV 저장
        return true; // 2. 성공시 true 반환한다. true의 타입은 boolean 타입이다.
    }//func e

    // (2) 전체조회
    public ArrayList<WaitingDto> waitingPrint(){
        return waitingDB; // waitingDB 변수의 타입은 ArrayList<WaitingDto>이다.
    }//func e

    // (*) CSV 파일 경로 지정 한다.
    public String path = "src/종합/과제7/data.CSV";
    // --------------------1. CSV 파일연동 ---------------------
    public void openCSV(){
        File file = new File(path);//(1) 파일 객체 생성한다.
        if(file.exists()){
            loadCSV();
        }else {
            try{file.createNewFile();} //파일 생성, 예외처리 한다.
            catch (IOException e){System.out.println(e);}
        }
    }//func e
    //--------------------2. CSV 입력(호출)함수-------------------
    public void loadCSV(){
        try{
        FileReader fileReader = new FileReader(path); //(1) FileReader 이용한 읽기모드 객체 생성
        CSVReader csvReader = new CSVReader(fileReader); //(2) CSVReader 에 FileReader 대입하여 CSV객체 생성
        List<String[]> inData = csvReader.readAll(); //(3) .readAll() 함수로 모든 CSV 정보를 읽어온다.
        for(String[] row : inData){ //향상된 for문
            String phone = row[0]; //첫번째 열
            String count = row[1]; //두번째 열
            WaitingDto waitingDto = new WaitingDto(phone, count); //(5) 각 열들을 하나의 dto로 생성
            waitingDB.add(waitingDto);} //(6) 생성된 dto를 리스트에 저장
        csvReader.close(); //(7) csvReader 안전하게 닫기
        }catch (Exception e){System.out.println(e);}
    }//func e
    //--------------------3. CSV 출력(저장)함수-------------------
    public void saveCSV(){
        try{
        //(1) FilWriter 파일 쓰기모드 객체 생성
        FileWriter fileWriter = new FileWriter(path);
        //(2) CSVWriter 에 fileWriter 객체에 대입하여 생성
        CSVWriter csvWriter = new CSVWriter(fileWriter);
        //(3) 빈 리스트 생성
        List<String[]> outDate = new ArrayList<>();
        //(4) 현재 모든 정보를 outData에 담아준다.
        for(WaitingDto waitingDto : waitingDB){
            //(5) dto 하나씩 인원과 연락처를 배열으로 구성
            String[] row = {waitingDto.getCount(), waitingDto.getPhone()};
            //(6) outData에 저장한다.
            outDate.add(row);
        }//for e
        //(7) 최종적으로 outDate를 CSV 내보내기 한다.
        csvWriter.writeAll(outDate);
        csvWriter.close(); //(8) 안전하게 객체 닫기
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
