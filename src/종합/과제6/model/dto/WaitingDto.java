package 종합.과제6.model.dto;

import 종합.과제6.model.dao.WaitingDao;

public class WaitingDto {//class s
    //1. 멤버변수
    private String phone;
    private String count;

    //2. 생성자
    public WaitingDto(){}
    public WaitingDto(String phone, String count) {
        this.phone = phone;
        this.count = count;
    }
    //3. 메소드

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
}//class e
