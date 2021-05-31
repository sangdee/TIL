package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-31
 */

/**
 * phone_number	return
 * "01033334444"	"*******4444"
 * "027778888"	"*****8888"
 */
public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
        String answer = "";
        for (int i = 0; i < phone_number.length(); i++) {
            if (phone_number.length() - i > 4){
                answer += "*";
            }else {
                answer += phone_number.charAt(i);
            }


        }
        return answer;
    }
}
