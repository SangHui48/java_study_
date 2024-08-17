package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        System.out.println("5개의 정수를 입력하세요:");
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int total = 0;
        double average;
        for (int i = 0; i<numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int number : numbers) {
            total += number;
        }
        average = (double) total / numbers.length;

        System.out.println("total = " + total);
        System.out.println("average = " + average);


    }
}