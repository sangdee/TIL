package programmers_lv1;

/**
 * @author : Sangji Lee
 * @when : 2021-05-30
 * @github : http://github.com/sangdee
 */
public class 소수찾기_1 {
    public static int solution(int n) {
        int answer = 0;

        for (int i = 3; i <= n; i++) {
            if (isPrime(i)) answer++;
        }

        return answer + 1;
    }

    public static boolean isPrime(int n) {
        if (n == 2) return true;
        if (n % 2 == 0 || n == 1) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
