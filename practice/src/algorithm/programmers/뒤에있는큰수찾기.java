package algorithm.programmers;

import java.util.Arrays;
import java.util.Stack;

public class 뒤에있는큰수찾기 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);

        Stack<Integer> stack = new Stack<>();
        for (int i = numbers.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && numbers[i] >= stack.peek()) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                answer[i] = stack.peek();
            }

            stack.push(numbers[i]);

        }
        return answer;
    }
}
