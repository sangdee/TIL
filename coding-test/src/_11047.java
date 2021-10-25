import java.util.Scanner;

public class _11047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long K = scanner.nextLong();
        int[] coinTypes = new int[N];
        int coinNums = 0;


        for (int i = 0; i < N; i++) {
            coinTypes[i] = scanner.nextInt();
        }
        for (int i = N - 1; i >= 0; i--) {
            coinNums += K / coinTypes[i];
            K %= coinTypes[i];

        }
        System.out.println(coinNums);
    }
}
