package temp;

import java.util.HashSet;
import java.util.Set;

public class 전화번호목록 {
    public static boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < phone_book.length; i++) {
            set.add(phone_book[i]);
        }
        for (String s : phone_book) {
            for (int i = 1; i < s.length(); i++) {
                if (set.contains(s.substring(0, i))) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"119", "97674223", "1195524421"}));
    }

}
