package lecture.array;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/04/24
 */
public class 큰수출력하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] split = scanner.nextLine().split(" ");
        String result = split[0] + " ";
        for (int i = 1; i < n; i++) {
            if (Integer.parseInt(split[i]) > Integer.parseInt(split[i - 1])) {
                result += split[i] + " ";
            }
        }
        System.out.println(result);
    }
}
