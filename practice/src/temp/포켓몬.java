package temp;

import java.util.HashSet;
import java.util.Set;

public class 포켓몬 {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int count = nums.length / 2;
        if (set.size() >= count) {
            return count;
        }
        return set.size();
    }
}
