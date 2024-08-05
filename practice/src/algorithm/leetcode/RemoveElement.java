package algorithm.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(new RemoveElement().removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(new RemoveElement().removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    public int removeElement(int[] nums, int val) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> expectedNums = list.stream()
                                         .filter(e -> e != val)
                                         .collect(Collectors.toList());
        for (int i = 0; i < expectedNums.size(); i++) {
            nums[i] = expectedNums.get(i);
        }
        return expectedNums.size();
    }
}
