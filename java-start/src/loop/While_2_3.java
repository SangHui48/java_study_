package loop;

public class While_2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1; // 스코프 관점에서 for 문과 비교해보기
        int endNum = 3;

        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i= " + i + " sum= "+ sum);
            i++;
        }
   }
}