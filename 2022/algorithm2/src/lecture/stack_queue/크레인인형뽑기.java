package lecture.stack_queue;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/11/14
 */
public class 크레인인형뽑기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] moves = new int[sc.nextInt()];
        for (int i = 0; i < moves.length; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(solution(arr, moves));
    }

    public static Integer solution(int[][] arr, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for (int i = 0; i < moves.length; i++) {
            int line = moves[i] - 1;
            for (int j = 0; j < arr.length; j++) {
                int spot = arr[j][line];
                if (spot != 0) {
                    arr[j][line] = 0;
                    if (stack.isEmpty()) {
                        stack.add(spot);
                    } else {
                        if (stack.peek() == spot) {
                            stack.pop();
                            result += 2;
                        } else {
                            stack.add(spot);
                        }
                    }
                    break;
                }
            }
        }
        return result;
    }
}
