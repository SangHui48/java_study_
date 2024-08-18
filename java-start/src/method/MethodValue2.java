package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("num = " + num);
        changeNumber(num);
        System.out.println("num = " + num);
    }
    
    public static void changeNumber(int num) {
        System.out.println("num = " + num);
        num *= 2;
        System.out.println("num = " + num);
    }
}
