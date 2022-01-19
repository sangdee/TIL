import java.util.Scanner;

public class _01065 {
    public static int checkHanNum(int number) {
        int num1 = number / 100 % 10;
        int num2 = number / 10 % 10;
        int num3 = number % 10;
        if (num2 * 2 == num1 + num3) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        if (num < 100) {
            System.out.println(num);
        } else {
            int value = 99;
            for (int i = 100; i <= num; i++) {
                value += checkHanNum(i);
            }
            if (num == 1000) {
                value--;
            }
            System.out.println(value);
        }
    }
}
