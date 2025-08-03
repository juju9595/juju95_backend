package 종합.과제8.model.dto;

public class WaitingDto {
    //1. 멤버변수
    private int wno;
    private String wphone;
    private String wcount;

    //2. 생성자
    //1) 기본생성자
    public WaitingDto(){}
    //2) 전체생성자
    public WaitingDto(int wno, String wphone, String wcount) {
        this.wno = wno;
        this.wphone = wphone;
        this.wcount = wcount;
    }
    //3. 메소드
    //1)setter
    //2)getter

    public int getWno() {
        return wno;
    }

    public void setWno(int wno) {
        this.wno = wno;
    }

    public String getWphone() {
        return wphone;
    }

    public void setWphone(String wphone) {
        this.wphone = wphone;
    }

    public String getWcount() {
        return wcount;
    }

    public void setWcount(String wcount) {
        this.wcount = wcount;
    }

    //3) toString


    @Override
    public String toString() {
        return "WaitingDto{" +
                "wno=" + wno +
                ", wphone='" + wphone + '\'' +
                ", wcount='" + wcount + '\'' +
                '}';
    }
}
