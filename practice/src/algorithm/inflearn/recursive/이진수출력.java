package algorithm.inflearn.recursive;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/29
 */
public class 이진수출력 {
    public static void recursive(int n) {
        if (n == 0) {
            return;
        }
        recursive(n / 2);
        System.out.println(n % 2);
    }

    public static void main(String[] args) {
        recursive(11);
    }
}
