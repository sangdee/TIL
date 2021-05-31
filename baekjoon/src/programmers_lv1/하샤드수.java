package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-31
 */
public class 하샤드수 {
    public boolean solution(int x) {
        String s = String.valueOf(x);
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }

        if (x % sum == 0){
            return true;
        } else return false;
    }
}
