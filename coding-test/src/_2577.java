import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-04-19
 */
public class _2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 1;
        for (int i = 0; i < 3; i++) {
            value *= scanner.nextInt();
        }
        String s = String.valueOf(value);
        List<Integer> tmpArr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            tmpArr.add(s.charAt(i) - '0');
        }

        int[] resultArr = new int[10];
        for (int i : tmpArr) {
            resultArr[i]++;
        }
        for (int i : resultArr) {
            System.out.println(i);
        }
    }
}
