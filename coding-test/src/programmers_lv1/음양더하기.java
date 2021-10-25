package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-28
 */

/**
 * absolutes	signs	result
 * [4,7,12]	[true,false,true]	9
 * [1,2,3]	[false,false,true]	0
 */
public class 음양더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (!signs[i]) {
                absolutes[i] = -absolutes[i];
            }
        }
        for (int absolute : absolutes) {
            answer += absolute;
        }


        return answer;
    }
}
