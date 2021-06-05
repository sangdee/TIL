/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-06-05
 */
public class 달팽이채우기 {
    public static int[] solution(int n) {

        int[] answer = new int[arrSize(n)];

        int[][] matrix = new int[n][n];

        int x = -1, y = 0;
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) {
                    x++;
                } else if (i % 3 == 1) {
                    y++;
                } else if (i % 3 == 2) {
                    x--;
                    y--;
                }
                matrix[x][y] = num++;
            }
        }

        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0)
                    break;
                answer[k++] = matrix[i][j];
            }
        }
        return answer;
    }

    public static int arrSize(int n) {
        if (n == 1)
            return 1;
        return arrSize(n - 1) + n;
    }

    public static void main(String[] args) {
        solution(5);
    }
}
