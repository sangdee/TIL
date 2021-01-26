import java.util.Scanner;

public class ct_greedy_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int result = s.charAt(0) - '0';
        for (int i = 1; i < s.length(); i++) {
            int num = s.charAt(i) - '0';
            if (result <= 1 || num <= 1) {
                result += num;
            } else {
                result *= num;
            }
        }
        System.out.println(result);
    }
}
