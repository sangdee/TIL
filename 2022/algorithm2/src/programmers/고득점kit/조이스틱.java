package programmers.고득점kit;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/30
 */
public class 조이스틱 {

    public int solution(String name) {
        int count = 0;
        int len = name.length();
        int move = len - 1;
        for (int i = 0; i < len; i++) {
            if (name.charAt(i) <= 'M') {
                count += name.charAt(i) - 'A';
            } else {
                count += 'Z' - name.charAt(i) + 1;
            }
            int next = i + 1;
            while (next < len && name.charAt(next) == 'A') {
                next++;
            }
            move = Math.min(move, i + len - next + Math.min(i, len - next));
        }
        return 0;
    }

    public static void main(String[] args) {
        String s = "MA";
        System.out.println(s.charAt(0) - 'A');
    }
}
