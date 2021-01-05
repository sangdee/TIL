import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @when : 2020-12-30
 * @github : http://github.com/sangji11
 */
public class _1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(), num2 = scanner.nextInt(), num3 = scanner.nextInt();
        System.out.println(Math.min((Math.min(num1, num2)), num3));

    }
}
