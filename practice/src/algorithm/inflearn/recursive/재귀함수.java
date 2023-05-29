package algorithm.inflearn.recursive;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/29
 */
public class 재귀함수 {
    public static void main(String[] args) {
        recursive(3);
    }

    public static void recursive(int n) {
        if (n == 0) {
            return;
        }
        recursive(n - 1);
        System.out.println(n);
    }
}
