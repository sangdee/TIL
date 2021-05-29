package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-29
 */

import java.util.ArrayList;
import java.util.List;

/**
 * arr	answer
 * [1,1,3,3,0,1,1]	[1,3,0,1]
 * [4,4,4,3,3]	[4,3]
 */
public class 같은숫자는싫어 {
    public static int[] solution(int[] arr) {
        int[] answer;
        List<Integer> list = new ArrayList<>();

        int temp = arr[0];
        list.add(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            if (temp != arr[i]) {
                temp = arr[i];
                list.add(temp);
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
    }
}
