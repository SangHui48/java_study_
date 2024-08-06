package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
//        int num = 2;
//        for (int cnt = 1; cnt <= 10; cnt++) {
//            System.out.println(num);
//            num += 2;
//        }
        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
            System.out.println(num);
        }
    }
}
