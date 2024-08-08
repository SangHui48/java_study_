package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue;
        
//        intValue = doubleValue // 컴파일 오류 발생
        intValue = (int) doubleValue;
        System.out.println("intValue = " + intValue); // 명시적 형변환
        System.out.println("doubleValue = " + doubleValue);

//        long longValue = 10000000000L;
//        intValue = (int) longValue;
//        System.out.println("intValue = " + intValue); // ㅋㅋㅋ
    }
}
