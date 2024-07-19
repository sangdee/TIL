package temp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 뒤집은소수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(String.valueOf(sc.nextInt()));
        }
        solution(n, list);
    }

    private static void solution(int n, List<String> list) {
        int[] eratos = eratos(100000);
        for (String s : list) {
            String reverseNum = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                char c = s.charAt(i);
                reverseNum += c;
            }
            int i = Integer.parseInt(reverseNum);
            if (eratos[i] == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static int[] eratos(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            if (arr[i] == 0) {
                for (int j = i + i; j < n + 1; j = j + i) {
                    arr[j] = 1;
                }
            }

        }
        return arr;
    }
}
