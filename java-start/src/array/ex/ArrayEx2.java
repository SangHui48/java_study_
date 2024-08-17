package array.ex;

import java.util.Scanner;

public class ArrayEx2 {

    public static void main(String[] args) {
        System.out.println("5개의 정수를 입력하세요:");
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i<numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("출력");

        for (int i = 0; i<numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }
    }
}