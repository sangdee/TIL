import java.util.Scanner;

public class _2438 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        String star = "*";
        for (int i = 0; i < length; i++) {
            System.out.println(star);
            star += "*";
        }
    }
}
