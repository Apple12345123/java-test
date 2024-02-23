package java_test;
// 2차원 배열의 합계 구하기
public class Test4 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        int sum = 0;

        for (int j = 0; j < array.length; j++) {
            int[] arrays;
            arrays = array[j];
            for (int i : arrays) {
                sum += i;
            }
        }

        System.out.println("합계 : " + sum);
    }
}
