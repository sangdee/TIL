package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/01/08
 */
public class 부족한금액계산하기 {
    public static long solution(int price, int money, int count) {
        long money2 = money;
        for (int i = 1; i <= count; i++) {
            money2 -= (long) price * i;
        }
        if (money2 > 0) {
            return 0;
        }
        System.out.println(money2);
        return -money2;
    }

    public static void main(String[] args) {
        solution(3, 20, 4);
    }

}
