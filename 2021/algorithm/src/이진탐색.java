import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-01-30
 */
public class 이진탐색 {

    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) return -1;
        int mid = (start + end) / 2;
        //찾은 경우 중간점 인덱스 반환
        if (arr[mid] == target) return mid;
            //중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인
        else if (arr[mid] > target) return binarySearch(arr, target, start, mid - 1);
        else return binarySearch(arr, target, mid + 1, end);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 원소의 개수(n)와 찾고자 하는 값(target)을 입력받기
        int n = scanner.nextInt();
        int target = scanner.nextInt();

        //전체 원소 입력 받기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = binarySearch(arr, target, 0, n - 1);
        if (result == -1) {
            System.out.println("원소 x");
        } else {
            System.out.println(result+1);
        }
    }
}
