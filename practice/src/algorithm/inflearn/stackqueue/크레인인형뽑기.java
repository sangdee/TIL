package algorithm.inflearn.stackqueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/14
 */
public class 크레인인형뽑기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        solution(board, moves);
    }

    private static void solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < moves.length; i++) {
            int move = moves[i] - 1;
            for (int j = 0; j < board.length; j++) {
                int doll = board[j][move];
                if (doll != 0) {
                    if (!stack.isEmpty() && stack.peek() == doll) {
                        stack.pop();
                        count++;
                    } else {
                        stack.add(doll);
                    }
                    board[j][move] = 0;
                    break;
                }
            }
        }
        System.out.println(count * 2);
    }
}
