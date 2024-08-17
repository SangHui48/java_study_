package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수:");
            arr[i][0] = sc.nextInt();
            System.out.print("영어 점수:");
            arr[i][1] = sc.nextInt();
            System.out.print("수학 점수:");
            arr[i][2] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            double average;
            for (int score : arr[i]) {
                sum += score;
            }
            average = (double)sum / arr[i].length;

            System.out.println((i + 1) + "번 학생의 총점: " + sum + ", 평균: " + average);
        }
    }
}
