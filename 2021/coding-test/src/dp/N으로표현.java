package dp;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-02-19
 */
public class N으로표현 {
    /**
     * 아래와 같이 5와 사칙연산만으로 12를 표현할 수 있습니다.
     * <p>
     * 12 = 5 + 5 + (5 / 5) + (5 / 5)
     * 12 = 55 / 5 + 5 / 5
     * 12 = (55 + 5) / 5
     * <p>
     * 5를 사용한 횟수는 각각 6,5,4 입니다. 그리고 이중 가장 작은 경우는 4입니다.
     * 이처럼 숫자 N과 number가 주어질 때, N과 사칙연산만 사용해서 표현 할 수 있는 방법 중 N 사용횟수의 최솟값을 return 하도록 solution 함수를 작성하세요.
     * <p>
     * 제한사항
     * N은 1 이상 9 이하입니다.
     * number는 1 이상 32,000 이하입니다.
     * 수식에는 괄호와 사칙연산만 가능하며 나누기 연산에서 나머지는 무시합니다.
     * 최솟값이 8보다 크면 -1을 return 합니다.
     */
    // 1  = 5/5
    // 2  = (5+5)/5
    // 3  = (5+5+5)/5
    public int solution(int N, int number) {
        int answer = 0;
        return answer;
    }
}
