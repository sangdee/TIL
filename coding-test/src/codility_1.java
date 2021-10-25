import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-02-18
 */
public class codility_1 {
    public static int solution(int n) {
        int answer = 0;
        String binary = Integer.toBinaryString(n);
        ArrayList<Integer> list = new ArrayList<>();
        char[] arr = new char[binary.length()];

        for (int i = 0; i < binary.length(); i++) {
            arr[i] = binary.charAt(i);
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                list.add(i + 1);
            }
        }
        if (list.size() >= 2) {
            int max = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                if (max < (list.get(i + 1) - list.get(i)) - 1) {
                    max = (list.get(i + 1) - list.get(i)) - 1;
                }
            }
            answer = max;
        }
        System.out.println(answer);
        System.out.println(Arrays.toString(arr));
        System.out.println(list);

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        solution(n);
    }
}
