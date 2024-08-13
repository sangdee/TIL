package algorithm.leetcode;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 */
public class MajorityElement {
    //    public int majorityElement(int[] nums) {
    //        int count = 0;
    //        int candidate = 0;
    //
    //        for (int num : nums) {
    //            if (count == 0) {
    //                candidate = num;
    //            }
    //
    //            count += (num == candidate) ? 1 : -1;
    //        }
    //
    //        return candidate;
    //    }
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int result = 0;
        int max = 0;
        for (Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() > max) {
                max = integerIntegerEntry.getValue();
                result = integerIntegerEntry.getKey();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement.majorityElement(nums));
    }
}
