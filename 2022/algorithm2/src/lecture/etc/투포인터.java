package lecture.etc;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/10
 */

//특정한 합을 가지는 부분 연속 수열 찾기
public class 투포인터 {
    public static int n = 5; // 데이터 개수
    public static int m = 5; //찾고자하는 부분 합
    public static int[] arr = {1, 2, 3, 2, 5};

    public static void main(String[] args) {
        int cnt = 0, intervalSum = 0, end = 0;
        for (int start = 0; start < n; start++) {
            while (intervalSum < m && end < n) {
                intervalSum += arr[end];
                end += 1;
            }
            if (intervalSum == m) {
                cnt += 1;
            }
            intervalSum -= arr[start];
        }
        System.out.println(cnt);
    }
}
