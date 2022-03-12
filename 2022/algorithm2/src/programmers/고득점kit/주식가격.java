package programmers.고득점kit;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/12
 */
public class 주식가격 {
    public int[] solution(int[] prices) {
        int length = prices.length;
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            int price = prices[i];
            for (int j = i + 1; j < length; j++) {
                answer[i]++;
                if (price > prices[j]) {
                    break;
                }
            }
        }
        return answer;
    }
}
