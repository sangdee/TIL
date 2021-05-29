package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-29
 */

import java.util.Arrays;

/**
 * 매개변수	값
 * n	5
 * arr1	[9, 20, 28, 18, 11]
 * arr2	[30, 1, 21, 17, 28]
 * 출력	["#####","# # #", "### #", "# ##", "#####"]
 */
public class 비밀지도 {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        Arrays.fill(answer, "");
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb1.append(Integer.toBinaryString(arr1[i]));
            sb2.append(Integer.toBinaryString(arr2[i]));

            int length1 = sb1.length();
            int length2 = sb2.length();
            if (length1 < n) {
                for (int j = 0; j < n - length1; j++) {
                    sb1.insert(0, 0);
                }
            }
            if (length2 < n) {
                for (int j = 0; j < n - length2; j++) {
                    sb2.insert(0, 0);
                }
            }
            for (int j = 0; j < n; j++) {
                int substring1 = Integer.parseInt(sb1.substring(j, j + 1));
                int substring2 = Integer.parseInt(sb2.substring(j, j + 1));
                if ((substring1 | substring2) == 1) {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }
            sb1.setLength(0);
            sb2.setLength(0);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28}));

    }
}
//public String[] solution(int n, int[] arr1, int[] arr2) {
//        String[] result = new String[n];
//        for (int i = 0; i < n; i++) {
//            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
//        }
//
//        for (int i = 0; i < n; i++) {
//            result[i] = String.format("%" + n + "s", result[i]);
//            result[i] = result[i].replaceAll("1", "#");
//            result[i] = result[i].replaceAll("0", " ");
//        }
//
//        return result;
//    }