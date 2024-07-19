package temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 공통원소구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        solution(n, m, arr1, arr2);
    }

    /**
     * 공통 원소를 추출하여 오름차순으로 출력
     */
    private static void solution(int n, int m, int[] arr1, int[] arr2) {
        Arrays.sort(arr1); //1 2 3 5 9
        Arrays.sort(arr2); //2 3 5 7 8
        int index1 = 0, index2 = 0;
        List<Integer> list = new ArrayList<>();
        while (index1 < n && index2 < m) {
            if (arr1[index1] == arr2[index2]) {
                list.add(arr1[index1]);
                index1++;
                index2++;
            } else if (arr1[index1] < arr2[index2]) {
                index1++;
            } else {
                index2++;
            }
        }
        list.forEach(e -> System.out.print(e + " "));
    }
}
