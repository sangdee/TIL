package algorithm.leetcode;

import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of('I', 1,
                                             'V', 5,
                                             'X', 10,
                                             'L', 50,
                                             'C', 100,
                                             'D', 500,
                                             'M', 1000);

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            Integer ci = map.get(s.charAt(i));

            if (i + 1 < s.length()) {
                if (ci < map.get(s.charAt(i + 1))) {
                    sum += (-ci);
                    continue;
                }
            }
            sum += ci;
        }
        return sum;
    }
}
