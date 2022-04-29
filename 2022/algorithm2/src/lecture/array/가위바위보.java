package lecture.array;

import java.util.Scanner;
import java.util.function.BiFunction;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/04/29
 */
public class 가위바위보 {
    static Scanner sc = new Scanner(System.in);
    static BiFunction<Integer, Integer, String> result = (a, b) -> {
        if (a.equals(b)) {
            return "D";
        }
        if (a == 1) {
            if (b == 2) {
                return "B";
            }
            if (b == 3) {
                return "A";
            }
        }
        else if (a == 2) {
            if (b == 1) {
                return "A";
            }
            if (b == 3) {
                return "B";
            }
        }
        else {
            if (b == 1) {
                return "B";
            }
            if (b == 2) {
                return "A";
            }
        }
        return "";
    };

    public static void main(String[] args) {
        int testCase = sc.nextInt();
        int[] aArr = new int[testCase],
            bArr = new int[testCase];
        inputValue(aArr, testCase);
        inputValue(bArr, testCase);

        for (int i = 0; i < testCase; i++) {
            System.out.println(result.apply(aArr[i], bArr[i]));
        }
    }

    static void inputValue(int[] arr, int count) {
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
