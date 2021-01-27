import java.util.Scanner;

public class _1541 {
    static int min = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] str = s.split("-");
        min = sum(str[0].split("\\+"));

        for (int i = 1; i < str.length; i++) {
            min -= sum(str[i].split("\\+"));
        }
        System.out.println(min);
    }

    static int sum(String[] input) {
        int result = 0;
        for (String num : input) {
            result += Integer.parseInt(num);
        }
        return result;
    }
}
