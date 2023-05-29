package algorithm.inflearn.recursive;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/29
 */
public class 팩토리얼 {
    public static int recursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n * recursive(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(recursive(5));
    }
}
