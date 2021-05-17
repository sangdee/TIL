package sort;

import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @when : 2021-05-14
 * @github : http://github.com/sangdee
 */
public class H_index {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        //[0,1,3,5,6]
        for (int i = 0; i < citations.length; i++) {
            int max = citations.length - i; // 5 4 3 2 1
            if (max <= citations[i]) {
                answer = max;

                break;
            }
        }
        return answer;
    }
}
