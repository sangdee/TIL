import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @when : 2021-01-02
 * @github : http://github.com/sangji11
 */
public class _2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) System.out.println("1");
        else System.out.println("0");
    }
}
