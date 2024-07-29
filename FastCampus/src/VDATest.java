public class VDATest {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 6; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        int x = 10;
        int y = 20;
        int tmp = y;
        y = x;
        x = tmp;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
