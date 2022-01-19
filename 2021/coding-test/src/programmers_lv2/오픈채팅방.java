package programmers_lv2;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-06-01
 */

import java.util.ArrayList;
import java.util.HashMap;

/**
 * ecord	result
 * ["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]
 * <p>
 * ["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]
 */
public class 오픈채팅방 {
    public static String[] solution(String[] record) {
        ArrayList<String> arr = new ArrayList();
        HashMap<String, String> map = new HashMap();
        for (int i = 0; i < record.length; i++) {
            String[] command = record[i].split(" ");

            if (command[0].equals("Enter")) {
                arr.add(command[1] + "님이 들어왔습니다.");
                map.put(command[1], command[2]);
            } else if (command[0].equals("Change")) {
                map.put(command[1], command[2]);
            } else {
                arr.add(command[1] + "님이 나갔습니다.");
            }
        }
        String[] answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            int idx = arr.get(i).indexOf("님");
            String id = arr.get(i).substring(0, idx);
            String[] temp = arr.get(i).split(" ");
            answer[i] = map.get(id) + "님이 " + temp[1];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan","Enter uid1235 Prada","Leave uid4567","Leave uid1235"}));
    }
}
