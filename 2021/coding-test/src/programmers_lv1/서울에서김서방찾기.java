package programmers_lv1;

/**
 * @author : Sangji Lee
 * @when : 2021-05-30
 * @github : http://github.com/sangdee
 */
public class 서울에서김서방찾기 {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }
}
