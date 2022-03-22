package programmers.고득점kit;

import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/22
 */
public class Hindex {
    int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;
        for (int i = 0; i < citations.length; i++) {
            int max = citations.length - i;
            if (citations[i] >= max){
                answer = max;
                break;
            }
        }
        return answer;
    }
}