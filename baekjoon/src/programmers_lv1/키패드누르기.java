package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-28
 */

/**
 * numbers	hand	result
 * [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"	"LRLLLRLLRRL"
 * [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]	"left"	"LRLLRRLLLRR"
 * [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]	"right"	"LLRLLRLLRL"
 * <p>
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 10 11 12
 */
public class 키패드누르기 {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        int left = 10;
        int right = 12;
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                answer.append("L");
                left = num;
            } else if (num == 3 || num == 6 || num == 9) {
                answer.append("R");
                right = num;
            } else {
                if (num == 0) {
                    num = 11;
                }
                int[] leftPosition = {(left - 1) / 3, (left - 1) % 3};
                int[] rightPosition = {(right - 1) / 3, (right - 1) % 3};
                int[] checkPosition = {(num - 1) / 3, 1};

                int leftDistance = Math.abs((leftPosition[0] - checkPosition[0])) + Math.abs((leftPosition[1] - checkPosition[1]));
                int rightDistance = Math.abs((rightPosition[0] - checkPosition[0])) + Math.abs((rightPosition[1] - checkPosition[1]));

                if (leftDistance < rightDistance) {
                    answer.append("L");
                    left = num;
                } else if (leftDistance > rightDistance) {
                    answer.append("R");
                    right = num;
                } else {
                    if (hand.equals("left")) {
                        answer.append("L");
                        left = num;
                    } else {
                        answer.append("R");
                        right = num;
                    }
                }
            }
        }
        return answer.toString();
    }
}
