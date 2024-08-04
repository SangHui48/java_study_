package operator;

public class Operator2 {
    public static void main(String[] args) {
        // 문자열
        String result1 = "hello" + "world";
        System.out.println("result1 = " + result1);
        
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println("result2 = " + result2);

        String result3 = "a + b = " + 10;
        System.out.println("result3 = " + result3);
        System.out.println(result3.getClass().getName());
        
        int a = 10;
        String str = "This is %d".formatted(a);
        System.out.println("str = " + str);
    }
}
