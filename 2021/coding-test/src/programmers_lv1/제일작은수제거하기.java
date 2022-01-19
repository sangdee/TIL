package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-31
 */

import java.util.ArrayList;
import java.util.List;

/**
 * arr	         return
 * [4,3,2,1]	[4,3,2]
 * [10]	        [-1]
 */
public class 제일작은수제거하기 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        if (arr.length > 1) {
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                    minIndex = i;
                }
            }
        } else {
            return new int[]{-1};
        }
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!(i == minIndex)) {
                list.add(arr[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
