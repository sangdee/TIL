import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @when : 2021-01-05
 * @github : http://github.com/sangji11
 */
public class _10952 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        while (a != 0 && b != 0) {
            System.out.println(a + b);
            a = in.nextInt();
            b = in.nextInt();
        }
    }
}
