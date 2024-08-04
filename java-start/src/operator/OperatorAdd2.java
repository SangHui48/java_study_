package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        System.out.println("a = " + a);
        b = ++ a; // a값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = a ++; // 현재 a의 값을 b에 대입한후에 a를 증감시킴.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        ++a;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);
    }
}
