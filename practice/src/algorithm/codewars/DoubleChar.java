package algorithm.codewars;

/**
 * Given a string, you have to return a string in which each character (case-sensitive) is repeated once.
 * "String"      -> "SSttrriinngg"
 * "Hello World" -> "HHeelllloo  WWoorrlldd"
 * "1234!_ "     -> "11223344!!__  "
 */
public class DoubleChar {
    public static String doubleChar(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.append(s.charAt(i)).append(s.charAt(i));
        }
        return result.toString();
    }
}
