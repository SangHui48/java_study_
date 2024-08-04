public class BinaryTest {
    public static void main(String[] args) {
        int a = 10;
        float b = 3.14f;
        boolean c = false;
        char d = 'D';
        String e = "Hello";

        int decimal = 69;
        System.out.println("decimal = " + decimal);
        int binary2 = 0b1000101;
        System.out.println("binary2 = " + binary2);
        String binary = Integer.toBinaryString(decimal);
        System.out.println("binary  = " + binary );
        System.out.println(binary.getClass().getName());
    }
}
