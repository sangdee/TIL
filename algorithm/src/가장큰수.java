import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-09-20 오후 2:18
 */
public class 가장큰수 {
    public static String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(arr, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        System.out.println(arr[0].equals("0") ? "0": answer);
        return arr[0].equals("0") ? "0": answer;
    }

    public static void main(String[] args) {
        int[] numbers = {0,0,0};
        solution(numbers);
    }
}
