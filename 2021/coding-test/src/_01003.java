import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @when : 2020-01-15 오후 1:47
 * @homepage : https://github.com/sangji11
 */
public class _01003 {
    private static int[] arr = new int[41];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < num; i++){
            int input =scanner.nextInt();
            if (input == 0) result.append("1 0" + "\n");
            else if(input == 1) result.append("0 1" + "\n");
            else{
                int first = fibonacci(input-1);
                int second = fibonacci(input);

                result.append(first)
                        .append(" ")
                        .append(second)
                        .append("\n");
            }
        }

        System.out.print(result);
    }

    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (arr[n] == 0) {
            arr[n] = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return arr[n];
    }
}
