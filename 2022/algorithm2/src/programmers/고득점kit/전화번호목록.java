package programmers.고득점kit;

import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/08
 */
public class 전화번호목록 {
    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++)
        if (phone_book[i + 1].startsWith(phone_book[i])) return false;
        return true;

    }

    public static void main(String[] args) {
        String[] arr = new String[] {"12", "123", "1235", "567", "88", "12"};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        // System.out.println(solution(new String[]{"11","12","111"}));
    }
}
