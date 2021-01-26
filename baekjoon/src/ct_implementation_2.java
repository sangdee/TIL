import java.util.Scanner;

public class ct_implementation_2 {

    public static boolean check(int h, int m, int s) {
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true;
        return false;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 23) {
            throw new Exception();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if (check(i, j, k)) count++;
                }
            }
        }
        System.out.println(count);
    }
}
