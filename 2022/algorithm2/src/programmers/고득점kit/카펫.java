package programmers.고득점kit;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/27
 */
public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;

        for (int i = 3; i < sum; i++) {
            int val = sum / i;

            if (sum % i == 0 && val >= 3) {
                int row = Math.max(i, val);
                int col = Math.min(i, val);
                int border = (row * 2) + ((col - 2) * 2);

                if (border == brown) {
                    answer[0] = row;
                    answer[1] = col;
                    break;
                }
            }
        }
        return answer;
    }
}
