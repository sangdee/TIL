import java.util.*;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-04-20
 */
public class _1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toUpperCase(Locale.ROOT);
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        List<Character> list = new ArrayList<>();
        int temp = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (temp < entry.getValue()) {
                temp = entry.getValue();
                if (!list.isEmpty()) {
                    list.removeAll(list);
                }
                list.add(entry.getKey());
            } else if (temp == entry.getValue()) {
                list.add(entry.getKey());
            }
        }
        if (list.size() > 1) {
            System.out.println("?");
        }else {
            System.out.println(list.get(0));
        }
    }
}
