package 종합.예제10.model.dto;

public class BoardDto {
    //1. 멤버변수 : private 필수로 하고 db테이블 속성과 일치화 *커스텀
    private int bno;
    private String bcontent;
    private String bwriter;

    //2. 생성자
    //1) 기본생성자
    public BoardDto(){}
    //2) 전체생성자
    public BoardDto(int bno, String bcontent, String bwriter) {
        this.bno = bno;
        this.bcontent = bcontent;
        this.bwriter = bwriter;
    }


    //3. 메소드
    //1)setter
    //2)getter

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBcontent() {
        return bcontent;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public String getBwriter() {
        return bwriter;
    }

    public void setBwriter(String bwriter) {
        this.bwriter = bwriter;
    }

    //3) toString

    @Override
    public String toString() {
        return "BoardDto{" +
                "bno=" + bno +
                ", bcontent='" + bcontent + '\'' +
                ", bwriter='" + bwriter + '\'' +
                '}';
    }
}
