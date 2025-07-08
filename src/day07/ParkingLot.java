package day07;

public class ParkingLot {//class s
    int calculateFee(int min) {
        int money = 0;
        if (min <= 30) {money = 1000;}//기본요금
        else {//사용 요금에 30분 빼고 (10분당) 나누기 10
            money = ((min - 30) / 10 * 500) + 1000;}
        money = money >= 20000 ? 20000 : money; // 만약에 금액이 2만원 초과이면 2만원, 아니면 금액 그대로
        return money;
    }
}
