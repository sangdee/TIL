package baekjoon.bruteforce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/01/22
 */
public class 덩치 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] personArr = new int[num][2];
        scanner.nextLine();
        String result = "";

        for (int i = 0; i < num; i++) {
            String[] s = scanner.nextLine().split(" ");
            personArr[i][0] = Integer.parseInt(s[0]);
            personArr[i][1] = Integer.parseInt(s[1]);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < personArr.length; i++) {
            int temp = 0;
            for (int j = 0; j < personArr.length; j++) {
                if (i == j) {
                    continue;
                }
                if ((personArr[i][0] < personArr[j][0] && personArr[i][1] < personArr[j][1])) {
                    temp++;
                }
            }
            list.add(temp + 1);
        }
        for (Integer i : list) {
            result += i + " ";
        }
        System.out.println(result.trim());
    }
}
