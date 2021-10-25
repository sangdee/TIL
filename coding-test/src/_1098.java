import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @when : 2021-01-02
 * @github : http://github.com/sangji11
 */
public class _1098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[scanner.nextInt()][scanner.nextInt()];
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int l = scanner.nextInt(), d = scanner.nextInt(), x = scanner.nextInt() - 1, y = scanner.nextInt() - 1;
            if (d == 0) {
                for (int j = 0; j < l; j++) {
                    arr[x][y + j] = 1;
                }
            } else {
                for (int j = 0; j < l; j++) {
                    arr[x + j][y] = 1;
                }
            }
        }
        for (int[] e : arr) {
            for (int f : e) {
                System.out.print(f + " ");
            }
            System.out.println("");
        }

    }
}
