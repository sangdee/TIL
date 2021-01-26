import java.util.*;

public class ct_implementation_4 {
    public static String str;
    public static ArrayList<Character> result = new ArrayList<>();
    public static int value = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        str = scanner.next();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                result.add(str.charAt(i));
            } else {
                value += str.charAt(i) - '0';
            }
        }
        Collections.sort(result);
        for (char c : result){
            System.out.print(c);
        }
        System.out.print(value);
    }
}
