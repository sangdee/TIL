package temp;

import java.util.HashMap;
import java.util.Scanner;

public class 매출액의종류 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(n, k, arr);
    }

    private static void solution(int n, int k, int[] arr) {
        int startIndex = 0, endIndex = k;
        HashMap<Integer, Integer> priceCountMap = new HashMap<>();
        for (int i = startIndex; i < endIndex; i++) {
            priceCountMap.put(arr[i], priceCountMap.getOrDefault(arr[i], 0) + 1);
        }

        System.out.print(priceCountMap.size() + " ");

        while (endIndex < n) {
            priceCountMap.put(arr[startIndex], priceCountMap.get(arr[startIndex]) - 1);
            if (priceCountMap.get(arr[startIndex]) == 0) {
                priceCountMap.remove(arr[startIndex]);
            }
            startIndex++;
            priceCountMap.put(arr[endIndex], priceCountMap.getOrDefault(arr[endIndex], 0) + 1);
            endIndex++;

            System.out.print(priceCountMap.size() + " ");

        }

    }
}
