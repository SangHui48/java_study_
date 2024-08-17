package array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int len = sc.nextInt();
        int[] numbers = new int[len];
        System.out.println(len+"개의 정수를 입력하세요:");

        int minValue = Integer.MAX_VALUE;
        int maxValue = 0;
//        min = max = numbers[0];
        for (int i = 0; i<numbers.length; i++) {
            numbers[i] = sc.nextInt();

            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: " + minValue);
        System.out.println("가장 큰 정수: " + maxValue);
    }
}