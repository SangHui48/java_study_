package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        if (m > 0) {
            int temp = m * 2; // 스코프 줄이기. 메모리 절약! 변수의 선언위치 잘 생각!
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
