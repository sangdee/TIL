package programmers_lv1;

import java.util.HashSet;

/**
 * @author : Sangji Lee
 * @when : 2021-05-27
 * @github : http://github.com/sangdee
 */
public class 포켓몬 {
    public int solution(int[] nums) {
        int n = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        if (n > set.size()) {
            return set.size();
        } else {
            return n;
        }
    }
}
