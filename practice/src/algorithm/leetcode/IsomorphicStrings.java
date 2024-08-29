package algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> dictionary = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (dictionary.containsKey(sc)) {
                if (tc != dictionary.get(sc)) {
                    return false;
                }
            } else if (dictionary.containsValue(tc)) {
                return false;
            } else {
                dictionary.put(sc, tc);
            }
        }
        return true;
    }
}
