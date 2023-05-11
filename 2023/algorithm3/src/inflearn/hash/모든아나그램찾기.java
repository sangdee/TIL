package inflearn.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/11
 */
public class 모든아나그램찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> comparedMap = new HashMap<>();
        for (int i = 0; i < t.length() - 1; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            comparedMap.put(t.charAt(i), comparedMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        int lt = 0;
        for (int i = t.length() - 1; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            if (map.equals(comparedMap)) {
                count++;
            }
            map.put(s.charAt(lt), map.getOrDefault(s.charAt(lt), 0) - 1);
            if (map.get(s.charAt(lt)) == 0) {
                map.remove(s.charAt(lt));
            }
            lt++;
        }
        System.out.println(count);
    }
}
