package java_test;

import java.util.Random;
import java.util.Scanner;

// 숫자 맞추기 게임
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int answer = random.nextInt(100)+1;
        int guessNumber;
        int tryCount = 0;

        while (true) {
            System.out.print("1~100 중에서 숫자를 맞춰보세요  ");
            guessNumber = scanner.nextInt();
            tryCount++;

            if (guessNumber == answer) {
                System.out.println("정답을 맞추셨네요! 축하드려요. " + (tryCount+1) + "번만에 맞추셨네요");
                break;
            } else if (guessNumber < answer) {
                System.out.println("작은 숫자를 말하셨네요. 높은 숫자를 찾아주세요.");
            } else if (guessNumber > answer) {
                System.out.println("큰 숫자를 말하셨네요. 낮은 숫자를 찾아주세요.");
            }
        }
    }
}
