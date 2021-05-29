package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-29
 */

import java.util.Arrays;

/**
 * 예제	dartResult	answer	설명
 * 1	1S2D*3T	    37	11 * 2 + 22 * 2 + 33
 * 2	1D2S#10S	9	12 + 21 * (-1) + 101
 * 3	1D2S0T	    3	12 + 21 + 03
 * 4	1S*2T*3S	23	11 * 2 * 2 + 23 * 2 + 31
 * 5	1D#2S*3S	5	12 * (-1) * 2 + 21 * 2 + 31
 * 6	1T2D3D#	    -4	13 + 22 + 32 * (-1)
 * 7	1D2S3T*	    59	12 + 21 * 2 + 33 * 2
 */
public class 다트게임 {
    public static int solution(String dartResult) {
        int answer = 0;
        int[] scores = new int[3];

        int j = -1;
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if (Character.isDigit(c)) {
                char nextType = dartResult.charAt(i + 1);
                if (Character.isDigit(nextType)) {
                    j++;
                    scores[j] += Integer.parseInt(dartResult.substring(i,i+2));
                    i++;
                } else {
                    j++;
                    scores[j] += c - '0';
                }
            } else {
                if (c == 'S') {
                } else if (c == 'D') {
                    scores[j] = (int) Math.pow(scores[j], 2);
                } else if (c == 'T') {
                    scores[j] = (int) Math.pow(scores[j], 3);
                } else if (c == '*') {
                    scores[j] *= 2;
                    if (j - 1 >= 0) {
                        scores[j - 1] *= 2;
                    }
                } else if (c == '#') {
                    scores[j] *= -1;
                }
            }
        }
        System.out.println(Arrays.toString(scores));
        for (int score : scores) {
            answer += score;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("1D2S#10S"));
    }
}
