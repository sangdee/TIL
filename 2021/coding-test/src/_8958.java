import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @when : 2021-01-06
 * @github : http://github.com/sangji11
 */
public class _8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] testCase = new String[n];
        for (int i = 0; i < n; i++) {
            testCase[i] = sc.next();
        }
        sc.close();
        int count, total;
        for (String result : testCase) {
            count = 0;
            total = 0;
            for (int i = 0; i < result.length(); ++i) {
                if (result.charAt(i) == 'O') {
                    total += ++count;
                } else {
                    count = 0;
                }
            }
            System.out.println(total);
        }
    }
}
