import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _1931 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] time = new int[n][2];

        for (int i = 0; i < n; i++) {
            time[i][0] = scanner.nextInt();
            time[i][1] = scanner.nextInt();
        }
        Arrays.sort(time, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });
        int count = 0;
        int endTime = 0;
        for (int i = 0; i < n; i++) {
            if (endTime <= time[i][0]) {
                endTime = time[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
