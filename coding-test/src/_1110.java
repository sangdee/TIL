import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @when : 2021-01-05
 * @github : http://github.com/sangji11
 */
public class _1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int one = x / 10;
        int two = x % 10;
        int temp = 0;
        int cnt = 0;
        while (true) {
            cnt++;
            temp = two;
            two = (one + two) % 10;
            one = temp;
            if (x == one * 10 + two) break;
        }
        System.out.println(cnt);
    }
}
