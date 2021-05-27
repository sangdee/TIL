package sort;

import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-26
 */
public class 가장큰수_2 {
    /**
     * numbers	return
     * [6, 10, 2]	"6210"
     * [3, 30, 34, 5, 9]	"9534330"
     */
    public static String solution(int[] numbers) {
        String answer = "";
        int length = numbers.length;
        String[] arr = new String[length];

        for (int i = 0; i < length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, (s1, s2) -> s2.concat(s1).compareTo(s1.concat(s2)));

        for (String s : arr) {
            answer += s;
        }
        if (answer.startsWith("0")) {
            return "0";
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{3, 30, 34, 5, 9, 0});
    }
}
