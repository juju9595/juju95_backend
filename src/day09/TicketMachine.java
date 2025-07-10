package day09;

public class TicketMachine {
    //1.멤버변수
    static int totalTickets = 0;
    //2.생성자

    //3.메소드
    //티켓 한장 발권하는 메소드
    public void issueTicket(){
        totalTickets ++;
        System.out.println("티켓 1장을 발권했습니다");
    }

    //총 티켓수를 발권하는 메소드
    static void printTotalTickets(){
        System.out.println(totalTickets);
    }
}
