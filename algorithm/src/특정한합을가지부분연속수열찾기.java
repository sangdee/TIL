/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-02-19
 */

//투포인터
class 특정한합을가지부분연속수열찾기 {
    public static int n = 5;// 데이터의 개수
    public static int m = 5;// 찾고자 하는 부분 합
    public static int[] arr = {1, 2, 3, 2, 5};

    public static void main(String[] args) {
        int count = 0, intervalSum = 0, end = 0;
        for (int start = 0; start < n; start++) {
            while (intervalSum < m && end < n) {
                intervalSum += arr[end];
                end += 1;
            }
            if (intervalSum == m) {
                count += 1;
            }
            intervalSum -= arr[start];
        }
        System.out.println(count);
    }
}
