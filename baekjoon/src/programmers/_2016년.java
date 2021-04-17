package programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-04-17
 */
public class _2016년 {
    public String solution(int a, int b) {
        int total = 0;
        String w[] = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int m[] = {31, 29, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
        for(int i =0;i<a-1;i++){
            total += m[i];
        }
        total += b-1;
        String answer = w[total%7];
        return answer;
    }
}
