package algorithm.inflearn.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/26
 * 결정알고리즘
 * N개의 마구간이 수직선상에 있습니다. 각 마구간은 x1, x2, x3, ......, xN의 좌표를 가지며, 마구간간에 좌표가 중복되는 일은 없습니다.
 * 현수는 C마리의 말을 가지고 있는데, 이 말들은 서로 가까이 있는 것을 좋아하지 않습니다. 각 마구간에는 한 마리의 말만 넣을 수 있고,
 * 가장 가까운 두 말의 거리가 최대가 되게 말을 마구간에 배치하고 싶습니다.
 * C마리의 말을 N개의 마구간에 배치했을 때 가장 가까운 두 말의 거리가 최대가 되는 그 최대값을 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 자연수 N(3<=N<=200,000)과 C(2<=C<=N)이 공백을 사이에 두고 주어집니다.
 * 둘째 줄에 마구간의 좌표 xi(0<=xi<=1,000,000,000)가 차례로 주어집니다.
 *
 * 출력
 * 첫 줄에 가장 가까운 두 말의 최대 거리를 출력하세요.
 *
 * 예시 입력 1
 *
 * 5 3
 * 1 2 8 4 9
 *
 * 예시 출력 3
 */
public class 마구간정하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 마구간의 수
        int c = sc.nextInt(); // 말의 수
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // 마구간의 좌표
        }
        Arrays.sort(arr);
        System.out.println(solution(arr, c));
    }

    private static int solution(int[] arr, int c) {
        int answer = 0;
        int lt = 1; // 최소 거리
        int rt = arr[arr.length - 1]; // 최대 거리
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        return answer;
    }

    private static int count(int[] arr, int mid) {
        int count = 1;
        int ep = arr[0]; // 첫번째 마구간에 말을 배치
        for (int i = 1; i < arr.length; i++) { // 두번째 마구간부터
            if (arr[i] - ep >= mid) { // 현재 마구간의 좌표에서 이전 마구간의 좌표를 뺀 값이 mid보다 크거나 같으면
                count++;
                ep = arr[i];
            }
        }
        return count;
    }

}
