package lecture.two_pointer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/17
 */
public class 두배열합치기 {

    public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int pointer1 = 0, pointer2 = 0;
        while (pointer1 < n && pointer2 < m) {
            if (a[pointer1] < b[pointer2]) {
                answer.add(a[pointer1++]);
            } else {
                answer.add(b[pointer2++]);
            }
        }
        while (pointer1 < n) {
            answer.add(a[pointer1++]);
        }
        while (pointer2 < m) {
            answer.add(b[pointer2++]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        for (int x : solution(n, m, a, b)) {
            System.out.println(x + " ");
        }
    }
}
