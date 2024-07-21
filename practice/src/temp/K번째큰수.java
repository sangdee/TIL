package temp;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class K번째큰수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, k, arr));
    }

    private static int solution(int n, int k, int[] arr) {
        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int l = j + 1; l < n; l++) {
                    treeSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        Object[] array = treeSet.toArray();
        if (treeSet.size() < k) {
            return -1;
        }
        return (int) array[treeSet.size() - k];
    }
}
