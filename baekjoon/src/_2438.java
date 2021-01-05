import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @when : 2021-01-05
 * @github : http://github.com/sangji11
 */
public class _2438 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String star = "*";
        for (int i = 0; i < n; i++) {
            System.out.println(star);
            star += "*";
        }
    }
}
