import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @when : 2021-01-02
 * @github : http://github.com/sangji11
 */
public class _14681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), y = scanner.nextInt();
        if (x > 0 && y > 0) System.out.println(1);
        else if (x < 0 && y > 0) System.out.println(2);
        else if (x < 0 && y < 0) System.out.println(3);
        else if (x > 0 && y < 0) System.out.println(4);
        else System.out.println("0은 포함될 수 없습니다.");
    }
}
