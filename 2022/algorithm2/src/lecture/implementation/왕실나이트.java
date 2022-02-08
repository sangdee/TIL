package lecture.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/08
 */
public class 왕실나이트 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //a,b,c,d,e,f,g,h
        String next = sc.next();

        Map<String, Integer> convertY = new HashMap<>() {{
            put("a", 1);
            put("b", 2);
            put("c", 3);
            put("d", 4);
            put("e", 5);
            put("f", 6);
            put("g", 7);
            put("h", 8);
        }};
        int x = next.charAt(1) - '0';
        int y = convertY.get(String.valueOf(next.charAt(0))); //next.charAt(0)-'a'+1
        int count = 0;
        int[] dx = {-1, -1, 1, 1, 2, 2, -2, -2};
        int[] dy = {-2, 2, -2, 2, 1, -1, 1, -1};
        //  서 , 동, 북, 남

        for (int i = 0; i < 8; i++) {

            int newRow = x + dx[i];
            int newColumn = y + dy[i];

            if (newRow < 1 || newColumn < 1 || newRow > 8 || newColumn > 8) {
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}
