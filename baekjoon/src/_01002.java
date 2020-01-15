import java.util.Scanner;

import static java.lang.Math.*;

/**
 * @author : Sangji Lee
 * @when : 2020-01-07 오후 4:45
 * @homepage : https://github.com/sangji11
 */
public class _01002 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] buffer = new int[count];

        for (int i = 0; i < count; i++) {
            int x1 = scanner.nextInt(), y1 = scanner.nextInt(), r1 = scanner.nextInt();
            int x2 = scanner.nextInt(), y2 = scanner.nextInt(), r2 = scanner.nextInt();
            double dist = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
            int m;

            if (abs(r1 - r2) < dist && dist < r1 + r2) {
                m = 2;
            } else if (x1 == x2 && y1 == y2 && r1 == r2) {
                m = -1;
            } else if (abs(r1 - r2) == dist || r1 + r2 == dist) {
                m = 1;

            } else m = 0;

            buffer[i] = m;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(buffer[i]);
        }
    }
}
