import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-26
 */
public class 숫자게임 {
    /**
     * A	                B	result
     * [5,1,3,7]	[2,2,6,8]	3
     * [2,2,2,2]	[1,1,1,1]	0
     */
    public int solution(int[] A, int[] B) {
        Arrays.sort(A); // 1 3 5 7
        Arrays.sort(B); // 2 2 6 8
        int answer = 0;
        int aWin = 0;
        int bWin = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[aWin] > B[bWin]) {
                bWin++;
            } else if (A[aWin] == B[bWin]) {
                bWin++;
            } else {
                aWin++;
                bWin++;
                answer++;
            }
        }

        return answer;
    }
}
