import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-06-02 오전 11:44
 */
public class _1099 {
    public static void main(String[] args) {
        int antX = 1;
        int antY = 1;
        int[][] maze = new int[10][10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }

        while (antX < 10 && antY < 10) {
            if (maze[antX][antY] == 0) {
                maze[antX][antY] = 9;
                antY++;
            } else if (maze[antX][antY] == 1) {
                antX++;
                antY--;
                } else if (maze[antX][antY] == 2) {
                maze[antX][antY] = 9 ;
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
}
