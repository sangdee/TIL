package lecture.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/11/09
 */
public class 모든아나그램찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int result = 0;

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        for (int i = 0; i < t.length(); i++) {
            tMap.put(tArr[i], tMap.getOrDefault(tArr[i], 0) + 1);
        }
        for (int i = 0; i < t.length() - 1; i++) {
            sMap.put(sArr[i], sMap.getOrDefault(sArr[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = t.length() - 1; rt < s.length(); rt++) {
            sMap.put(sArr[rt], sMap.getOrDefault(sArr[rt], 0) + 1);

            if (sMap.equals(tMap)) {
                result++;
            }
            sMap.put(sArr[lt], sMap.get(sArr[lt]) - 1);
            if (sMap.get(sArr[lt]) == 0) {
                sMap.remove(sArr[lt]);
            }
            lt++;
        }
        System.out.println(result);
    }
}
