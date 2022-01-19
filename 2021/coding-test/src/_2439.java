import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @when : 2021-01-05
 * @github : http://github.com/sangji11
 */
public class _2439 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
