package lecture.hash;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/10/10
 */
public class 학급회장 {
    public static Character solution(int n, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 1) + 1);
        }
        Comparator<Entry<Character, Integer>> comparator = Entry.comparingByValue();
        Entry<Character, Integer> maxEntry = Collections.max(map.entrySet(), comparator);

        return maxEntry.getKey();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println(solution(n, s));

    }
}
