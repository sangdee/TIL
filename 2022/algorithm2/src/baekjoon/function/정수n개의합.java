package baekjoon.function;

import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/01/19
 */
public class 정수n개의합 {
    long sum(int[] a) {
        return Arrays.stream(a).sum();
    }
}
