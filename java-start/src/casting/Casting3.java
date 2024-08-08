package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 맥스값₩
        long maxIntOver = 2147483648L;
        int intValue = 0;
        
        intValue = (int) maxIntValue;
        System.out.println("max value casting = " + intValue);

        intValue = (int) maxIntOver; // 오버플로우 문제 발생
        System.out.println("overcasting = " + intValue);
    }
}
