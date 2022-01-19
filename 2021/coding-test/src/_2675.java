import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-02-01
 */
public class _2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            int r = scanner.nextInt();
            String str = scanner.next();

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < r; k++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }

    }
}
