package java_test;

import java.util.Scanner;

// 간단한 계산기 만들기
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요: ");
        double first = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력하세요: ");
        double second = scanner.nextInt();

        System.out.println("연산자를 입력하세요: ");
        String operatoer = scanner.next();

        double result = 0;

        switch (operatoer) {
            case "+" :
                result = first + second;
                break;
            case "-" :
                result = first - second;
                break;
            case "*" :
                result = first * second;
                break;
            case "/" :
                result = first / second;
                if (second == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    break;
                }

        }

        System.out.println("결과는  " + result);
    }
}
