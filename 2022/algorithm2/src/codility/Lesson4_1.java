package codility;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/09/17
 */
public class Lesson4_1 {
    public static void main(String[] args) {
        String s = "aaaa";
        int[] c = {3,4,5,6};
        System.out.println(solution(s, c));
    }

    public static int solution(String s, int[] c)
    {
        char[] arr = s.toCharArray();

        char now = arr[0];
        int nowCost = c[0];

        int result = 0;
        for (int i = 1; i < arr.length; i++) {
            if (now == arr[i]) {
                if (nowCost >= c[i]) {
                    result += c[i];
                } else {
                    result += nowCost;
                    nowCost = c[i];
                }
            } else {
                nowCost = c[i];
            }
            now = arr[i];
        }
        return result;
    }
}
