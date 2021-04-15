package programmers;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sangji Lee
 * @when : 2021-04-15
 * @github : http://github.com/sangdee
 */
public class 크레인인형뽑기게임 {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < moves.length; i++) {
            int taget = moves[i] - 1;

            for (int j = 0; j < board[0].length; j++) {
                if (board[j][taget] != 0) {
                    list.add(board[j][taget]);
                    board[j][taget] = 0;
                    break;
                }
            }
            if (list.size() > 1) {
                for (int j = 0; j < list.size() - 1; j++) {
                    if (list.get(j).equals(list.get(j + 1))) {
                        list.remove(j + 1);
                        list.remove(j);
                        answer += 2;
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        solution(board, moves);
    }
}
