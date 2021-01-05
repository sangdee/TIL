import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @when : 2021-01-02
 * @github : http://github.com/sangji11
 */
public class _1330 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a > b) System.out.println(">");
        else if (a < b) System.out.println("<");
        else System.out.println("==");

    }
}
