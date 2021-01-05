import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @when : 2021-01-02
 * @github : http://github.com/sangji11
 */
public class _2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        if (m < 45) {
            h--;
            m = 60 - (45 - m);
            if (h < 0) {
                h = 23;
            }
            System.out.println(h + " " + m);
        } else
            System.out.println(h + " " + (m - 45));
    }
}
