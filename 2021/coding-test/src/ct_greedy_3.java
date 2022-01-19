import java.util.Arrays;
import java.util.Scanner;

public class ct_greedy_3 {
    //모험가 N , 공포도가 X인 모함가는 반드시 X명 이상으로 구성

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] fears = new int[n];
        for (int i = 0; i < n; i++) {
            fears[i] = scanner.nextInt();
        }
        Arrays.sort(fears);

        int result = 0;
        int count = 0;
        for (int i = 0; i < fears.length; i++) {
            count += 1;
            if (count >= fears[i]) {
                result += 1;
                count = 0;
            }
        }
        System.out.println(result);
    }
}
