import java.util.Arrays;
import java.util.Scanner;

public class _11399 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] time = new int[n];

        for (int i = 0; i < n; i++) {
            time[i] = scanner.nextInt();
        }

        Arrays.sort(time);

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result += time[j];
            }

        }
        System.out.println(result);
    }
}
