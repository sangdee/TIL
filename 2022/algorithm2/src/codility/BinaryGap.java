package codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/09/15
 */
public class BinaryGap {
    public static Integer solution(Integer n) {
        String binaryString = Integer.toBinaryString(n);
        int count = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < binaryString.length(); i++) {
            char c = binaryString.charAt(i);
            if (c == '0') {
                count++;
            } else {
                list.add(count);
                count = 0;
            }
        }
        Collections.sort(list);

        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        solution(1041);
    }
}
