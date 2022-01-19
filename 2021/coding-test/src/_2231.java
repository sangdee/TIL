import java.util.Scanner;

public class _2231 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int num = i;
            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum + i == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
