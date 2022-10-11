package lecture.hash;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/10/11
 */
public class 아나그램 {

    public static String solution(String word, String secondWord) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        String result = "YES";
        for (int i = 0; i < word.length(); i++) {
            char c1 = word.charAt(i);
            char c2 = secondWord.charAt(i);
            map1.put(c1, map1.getOrDefault(c1, 0) + 1);
            map2.put(c2, map2.getOrDefault(c2, 0) + 1);
        }

        for (Entry<Character, Integer> entry : map1.entrySet()) {
            if (!map2.get(entry.getKey()).equals(entry.getValue())) {
                result = "NO";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String secondWord = sc.nextLine();
        System.out.println(solution(word, secondWord));
    }
}
