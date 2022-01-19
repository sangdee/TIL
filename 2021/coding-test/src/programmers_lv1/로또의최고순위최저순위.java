package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-28
 */

import java.util.ArrayList;

/**
 * ottos	win_nums	result
 * [44, 1, 0, 0, 31, 25]	[31, 10, 45, 1, 6, 19]	[3, 5]
 * [0, 0, 0, 0, 0, 0]	[38, 19, 20, 40, 15, 25]	[1, 6]
 * [45, 4, 35, 20, 3, 9]	[20, 9, 3, 45, 4, 35]	[1, 1]
 */
public class 로또의최고순위최저순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        ArrayList<Integer> winList = new ArrayList<>();

        int winning = 0;
        int hidden = 0;
        for (int win : win_nums) {
            winList.add(win);
        }
        for (int lotto : lottos) {
            if (winList.contains(lotto)) {
                winning++;
            } else if (lotto == 0) {
                hidden++;
            }
        }
        answer[0] = getGrade(winning + hidden);
        answer[1] = getGrade(winning);

        return answer;
    }

    public int getGrade(int value) {
        if (value == 6) {
            return 1;
        } else if (value == 5) {
            return 2;
        } else if (value == 4) {
            return 3;
        } else if (value == 3) {
            return 4;
        } else if (value == 2) {
            return 5;
        } else {
            return 6;
        }
    }
}
