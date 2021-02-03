package stack_queue;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-02-03
 */
public class 주식가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int count = 0;
            if (i < prices.length - 1) {
                for (int j = i + 1; j < prices.length; j++) {
                    if (prices[i] > prices[j]) {
                        answer[i] = j - i;
                        break;
                    } else {
                        count++;
                        answer[i] = count;
                    }
                }
            } else {
                answer[prices.length - 1] = 0;
            }
        }
        return answer;

    }
}
