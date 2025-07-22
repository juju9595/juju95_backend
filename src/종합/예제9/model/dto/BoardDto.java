package 종합.예제9.model.dto;

public class BoardDto {
    //1. 멤버변수
    private String content;
    private String writer;

    //2. 생성자
    //1) 기본생성자
    public BoardDto(){}
    //2) 전체생성자
    public BoardDto(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }


    //3. 메소드
    //1)setter
    //2)getter
    //3) toString


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
