package algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        SummaryRanges summaryRanges = new SummaryRanges();
        summaryRanges.summaryRanges(new int[]{0, 1, 2, 4, 5, 7});
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) {
            return list;
        }

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                max = nums[i];
            } else {
                if (max != min) {
                    list.add(min + "->" + max);
                } else {
                    list.add(String.valueOf(min));
                }
                min = nums[i];
                max = nums[i];
            }
        }
        if (max != min) {
            list.add(min + "->" + max);
        } else {
            list.add(String.valueOf(min));
        }
        return list;
    }
    //    public List<String> summaryRanges(int[] nums) {
    //        LinkedList<String> result = new LinkedList<>();
    //        int length = nums.length;
    //        int left = 0;
    //        for (int i = 1; i < length + 1; i++) {
    //            if (i == length || nums[i] != nums[i - 1] + 1) {
    //                if (i - 1 == left) {
    //                    result.add(String.valueOf(nums[left]));
    //                } else {
    //                    result.add(String.format("%d->%d", nums[left], nums[i - 1]));
    //                }
    //                left = i;
    //            }
    //        }
    //        return result;
    //    }
}
