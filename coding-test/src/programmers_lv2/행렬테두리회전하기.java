package programmers_lv2;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-06-05
 */

/**
 * rows	columns	queries	result
 * 6	6	[[2,2,5,4],[3,3,6,6],[5,1,6,3]]	            [8, 10, 25]
 * 3	3	[[1,1,2,2],[1,2,2,3],[2,1,3,2],[2,2,3,3]]	[1, 1, 5, 3]
 * 100	97	[[1,1,100,97]]	                                [1]
 */
public class 행렬테두리회전하기 {
    static int [][] map;
    public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        map = new int[rows][columns];

        int start = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                map[i][j] = start++;
            }
        }
        for (int i = 0; i < queries.length; i++) { // 회전하고 최솟값 answer에 저장
            answer[i] = rotate(queries[i]);
        }
        return answer;
    }

    public static int rotate(int[] arr) {
        int r1 = arr[0] - 1; // 1
        int c1 = arr[1] - 1; // 1
        int r2 = arr[2] - 1; // 4
        int c2 = arr[3] - 1; // 3
//          [[2,2,5,4],[3,3,6,6],[5,1,6,3]]
        int temp = map[r1][c1]; // 시작위치 값 임시저장
        int min = temp;                 // min값 초기화
        for (int i = r1; i < r2; i++) { // 회전의 1번
            map[i][c1] = map[i + 1][c1];
            if (min > map[i][c1]) min = map[i][c1];
        }
        for (int i = c1; i < c2; i++) { // 회전의 2번
            map[r2][i] = map[r2][i + 1];
            if (min > map[r2][i]) min = map[r2][i];
        }
        for (int i = r2; i > r1; i--) { // 회전의 3번
            map[i][c2] = map[i - 1][c2];

            if (min > map[i][c2]) min = map[i][c2];
        }
        for (int i = c2; i > c1; i--) { // 회전의 4번
            map[r1][i] = map[r1][i - 1];
            if (min > map[r1][i]) min = map[r1][i];
        }
        map[r1][c1 + 1] = temp; // 임시저장한 값 저장

        return min;
    }

    public static void main(String[] args) {
        solution(6, 6, new int[][]{
                {2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}
        });
    }
}
