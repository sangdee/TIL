package algorithm.codewars;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder builder = new StringBuilder();
        builder.append("(");
        for (int i = 0; i < numbers.length; i++) {
            builder.append(numbers[i]);
            if (i == 2) {
                builder.append(") ");
            }
            if (i == 5) {
                builder.append("-");
            }
        }
        return builder.toString();
    }
}
