package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 > num2) {
            int tmp = num2;
            num2 = num1;
            num1 = tmp;
        }

        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }

    }
}
