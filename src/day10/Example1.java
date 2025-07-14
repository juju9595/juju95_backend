package day10;

//1.싱글톤 만들기
class Controller{
    //1.
    private Controller(){}
    //2. private static final 이용한 인스턴스를 하나 만든다.<싱글톤>
    private static final Controller controller = new Controller();
    //3. public static 이용한 인스턴스 getter 메소드 만든다.<싱글톤 반환>
    public static Controller getInstance(){
        return controller; //싱글톤을 갖는 변수를 반환
    }//func e
}//class e
public class Example1 {
    public static void main(String[] args) {
        //4.싱글톤 불러오기
        Controller.getInstance(); //vs new Controller();
    }//main e
}//class e
