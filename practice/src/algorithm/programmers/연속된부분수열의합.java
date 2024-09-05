package algorithm.programmers;

public class 연속된부분수열의합 {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {0, sequence.length - 1};
        int left = 0, right = 1;
        int sum = sequence[0];

        while (left < right) {
            if (sum == k) {
                if (answer[1] - answer[0] > right - 1 - left) {
                    answer[1] = right - 1;
                    answer[0] = left;
                }
                sum -= sequence[left];
                left++;
            } else if (sum > k) {
                sum -= sequence[left];
                left++;
            } else if (right < sequence.length) {
                sum += sequence[right];
                right++;
            } else {
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        연속된부분수열의합 연속된부분수열의합 = new 연속된부분수열의합();
        연속된부분수열의합.solution(new int[]{1, 2, 3, 4, 5}, 7);

    }
}
