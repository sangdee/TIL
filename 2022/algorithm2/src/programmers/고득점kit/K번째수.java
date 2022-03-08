package programmers.고득점kit;

import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/08
 */
public class K번째수 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int[] arr = new int[end - start];
            for (int j = start; j < end; j++) {
                arr[j - start] = array[j];
            }
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2]- 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[] {1, 5, 2, 6, 3, 7, 4}, new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
    }
}
