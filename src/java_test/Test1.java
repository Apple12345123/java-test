package java_test;

import java.util.Scanner;

// 구구단 출력하기
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("출력할 단을 입력해주세요: ");
        int n = scanner.nextInt();

        for (int i = 0; i < 9; i++) {
            System.out.println(n + "*" + (i + 1) + "=" + n*(i+1));
        }
    }
}
