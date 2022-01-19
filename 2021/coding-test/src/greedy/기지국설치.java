package greedy;


/**
 * @author : Sangji Lee
 * @when : 2021-05-25
 * @github : http://github.com/sangdee
 */
public class 기지국설치 {
    public static int solution(int n, int[] stations, int w) {
        int answer = 0;
        int index = 0;
        int position = 1;

        while (position <= n) {
            if (index < stations.length && stations[index] - w <= position) {
                position = stations[index] + w + 1;
                index += 1;
            } else {
                answer += 1;
                position += w * 2 + 1;

            }
        }
        return answer;
    }
}
