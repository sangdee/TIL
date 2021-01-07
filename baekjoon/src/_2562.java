import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @when : 2021-01-06
 * @github : http://github.com/sangji11
 */
public class _2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[9];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
//        int max = numbers[0];
//        int count = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (max < numbers[i]) max = numbers[i];
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == max) {
//                count = i + 1;
//            }
//        }
//        System.out.println(max);
//        System.out.println(count);
        int count = 0, max = 0, index = 0;
        for (int value : numbers) {
            count++;
            if (value > max) {
                max = value;
                index = count;
            }
        }
        System.out.println(max + "\n" + index);
    }
}
