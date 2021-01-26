import java.util.Scanner;

public class ct_greedy_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), K = scanner.nextInt();
        int count = 0;

        while (N != 1) {
            if (N % K == 0) {
                N /= K;
            } else {
                N -= 1;
            }
            count++;
        }
        System.out.println(count);
    }
}
