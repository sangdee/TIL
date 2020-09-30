/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-09-27 오후 5:50
 */
public class 큰수만들기 {
    public static String solution(String number, int k) {
        String answer = "";
        String value = "";
        System.out.println(number.charAt(1));
        for (int i = 0; i <number.length() -1  ; i++) {
            number = number.substring(i,i);
            for (int j = i + 1; j <number.length()-1 ; j++) {
               number =  number.substring(j,j);
                value = number;
            }
        }
        System.out.println(value);
        return answer;
    }

    public static void main(String[] args) {
        String number = "1924";
        int k = 2;
        solution(number, k);
    }
}
