package algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows == 1) {
            list.add(List.of(1));
            return list;
        } else if (numRows > 1) {
            list.add(List.of(1));
            list.add(List.of(1, 1));
        }

        for (int i = 2; i < numRows; i++) {
            List<Integer> previousList = list.get(i - 1);
            List<Integer> newList = new ArrayList<>();

            newList.add(1);
            for (int j = 1; j < previousList.size(); j++) {
                int value = previousList.get(j - 1) + previousList.get(j);
                newList.add(value);
            }
            newList.add(1);

            list.add(newList);
        }

        return list;
    }
}
