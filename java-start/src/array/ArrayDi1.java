package array;

public class ArrayDi1 {
    public static void main(String[] args) {
        // 2x3 2차원 배열 만들기
        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++ ) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
