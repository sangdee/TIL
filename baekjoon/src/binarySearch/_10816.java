package binarySearch;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-17
 */
public class _10816 {
    public static void main(String[] args) throws IOException {

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nArr = new int[n];
//        for (int i = 0; i < n; i++) {
//            nArr[i] = scanner.nextInt();
//        }
//        Arrays.sort(nArr);
//
//        int m = scanner.nextInt();
//        int[] mArr = new int[m];
//        for (int i = 0; i < m; i++) {
//            mArr[i] = scanner.nextInt();
//        }
//
//        for (int i : mArr) {
//            int cnt = countByRange(nArr, i, i);
//            System.out.print(cnt + " ");
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(a);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int k = Integer.parseInt(st.nextToken());
            int count = countByRange(a, k, k);
            bw.append(count + " ");
        }

        bw.flush();
        bw.close();
    }

    public static int lowerBound(int[] arr, int target, int start, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= target) end = mid;
            else start = mid + 1;
        }
        return end;
    }

    public static int upperBound(int[] arr, int target, int start, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) end = mid;
            else start = mid + 1;
        }
        return end;
    }

    // 값이 [left_value, right_value]인 데이터의 개수를 반환하는 함수
    public static int countByRange(int[] arr, int leftValue, int rightValue) {
        // 유의: lowerBound와 upperBound는 end 변수의 값을 배열의 길이로 설정
        int rightIndex = upperBound(arr, rightValue, 0, arr.length);
        int leftIndex = lowerBound(arr, leftValue, 0, arr.length);
        return rightIndex - leftIndex;
    }

}
