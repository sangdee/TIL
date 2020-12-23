import java.util.Scanner;

public class _04344 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();
        int n, sum, count;
        double value;
        for (int i = 0; i < c; i++) {
            n = scanner.nextInt();
            sum = 0;
            count = 0;
            int[] list = new int[n];
            for (int j = 0; j < n; j++) {
                list[j] = scanner.nextInt();
                sum += list[j];
            }
            value = sum / n;
            for (int j = 0; j < n; j++) {
                if (list[j] > value) {
                    count++;
                }
            }
            System.out.println(String.format("%.3f", 100.0 * count / n) + "%");
        }

    }
}
