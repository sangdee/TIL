package temp;

import java.util.Arrays;

public class 가장큰수 {
    public static String solution(int[] numbers) {
        String answer = "";
        Integer[] array = Arrays.stream(numbers).boxed().toArray(Integer[]::new);

        Arrays.sort(array, (o1, o2) -> {
            String str1 = o1.toString() + o2.toString();
            String str2 = o2.toString() + o1.toString();
            return str2.compareTo(str1); // 내림차순
        });
        if (array[0] == 0) {
            return "0";
        }
        for (int i = 0; i < array.length; i++) {
            answer += array[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{6, 10, 2}));
        System.out.println(solution(new int[]{3, 30, 34, 5, 9}));
    }
}
