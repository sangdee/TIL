package algorithm.inflearn.string;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2024/01/14
 */
//양의정수n이 주어지면 n의 십진표기를 반대로 뒤집어서 만들어지는 다른 정수를 표준 출력으로 출력하는 함수 solution구현이 주어짐
//이 함수는 결과로 선행0을 갖는 정수를 출력할 수 없다.
public class Kakao1 {
    public static void main(String[] args) {
        solution(10010);
    }

    public static void solution(int N) {
        //        int enable_print = N % 10;
        int enable_print = 1;
        while (N > 0) {
            if (enable_print == 0 && N % 10 != 0) {
                enable_print = 1;
            } else if (enable_print == 1) {
                System.out.print(N % 10);
            }
            N = N / 10;
        }
    }
}
