package 종합.과제7.model.dto;

public class WaitingDto {
    //1. 멤버변수
    //1) private
    private String phone;
    private String count;

    //2. 생성자
    //1) 기본생성자
    //2) 전체생성자
    public WaitingDto(){}

    public WaitingDto(String phone, String count) {
        this.phone = phone;
        this.count = count;
    }
    //3. 메소드
    //1)setter
    //2)getter
    //3) toString


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "WaitingDto{" +
                "phone='" + phone + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}
