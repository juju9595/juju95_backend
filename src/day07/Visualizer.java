package day07;

public class Visualizer {//class

    String getStar(int 정수) {
        String star = "";
        for (int i = 1; i <= 정수; i++) {
            star += "★"; // 한번씩 1부터 x까지
        }//for e
        return star; // 최종적인 문자열 반환
    }//func e
}//class e
