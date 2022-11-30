package lecture.sort;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/11/30
 */
public class 중복확인 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            map.put(data, map.getOrDefault(data, 0) + 1);
        }
        boolean flag = false;
        for (Integer integer : map.values()) {
            if (integer > 1) {
                flag = true;
                break;
            }
        }
        System.out.println(flag ? "D" : "U");
    }

}
