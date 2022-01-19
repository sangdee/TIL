import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @when : 2021-01-06
 * @github : http://github.com/sangji11
 */
public class _1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double[] scores = new double[N];
        double max = 0;
        double avg = 0;

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }
        for (double value : scores) {
            if (value > max) {
                max = value;
            }
        }

        for (int i = 0; i < scores.length; i++) {
            avg += (scores[i] / max) * 100;
        }
        System.out.println(avg / scores.length);

    }
}
