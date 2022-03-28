package programmers.고득점kit;

import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/28
 */
public class 소수찾기 {
    public int solution(String numbers) {
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        permutation("", numbers, set);
        int answer = 0;
        for (int i : set) {
            set.remove(i);
            if (i == 2)
                answer++;
            if (i % 2 != 0 && isEfficiencyPrimeNumber(i)) {
                answer++;
            }
        }
        return answer;
    }

    private void permutation(String s, String numbers, ConcurrentSkipListSet<Integer> set) {
        int n = numbers.length();
        if (!s.equals("")) {
            set.add(Integer.valueOf(s));
        }
        for (int i = 0; i < n; i++) {
            permutation(s + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i + 1, n), set);
        }
    }

    public boolean isEfficiencyPrimeNumber(int x) {
        if (x == 0 || x == 1)
            return false;
        for (int i = 3; i <= Math.sqrt(x); i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
