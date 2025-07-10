package 종합.과제4;

public class Waiting {
    //1.멤버변수
    private String phone;
    private String count;

    //2.생성자
    //1)기본생성자
    public Waiting(){}

    //2) 전체매개변수를 갖는 생성자

    public Waiting(String phone, String count) {
        this.phone = phone;
        this.count = count;
    }

    //3.메소드

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

    //2) 개발자가 작업하면서 객체의 주소값이 아닌 객체내 멤버변수 값 문자열로 반환, toString()지원한다.
    //자동 :

    @Override
    public String toString() {
        return "Waiting{" +
                "phone='" + phone + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}

