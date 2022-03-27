package programmers.고득점kit;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/27
 */
public class 타겟넘버 {

    public static int solution(int[] numbers, int target) {

        return dfs(numbers, target, 0, 0);
    }

    static int dfs(int[] numbers, int target, int node, int sum) {
        if (node == numbers.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }
        return dfs(numbers, target, node + 1, sum + numbers[node])
            + dfs(numbers, target, node + 1, sum - numbers[node]);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,1,1,1}, 3));
    }
}
