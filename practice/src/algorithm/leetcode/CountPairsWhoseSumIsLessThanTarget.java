package algorithm.leetcode;

import java.util.Collections;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }
}
