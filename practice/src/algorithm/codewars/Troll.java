package algorithm.codewars;

public class Troll {
    //a e i ou
    public static String disemvowel(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.toLowerCase().charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }
}
