public class 숫자문자열과영단어 {

    public static int solution(String s) {
        StringBuilder answer = new StringBuilder();

        StringBuilder temp = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (temp.length() != 0) {
                    int i = stringConverter(temp.toString());
                    answer.append(i);
                    temp.setLength(0);
                }
                answer.append(c);
            } else {
                int i = stringConverter(temp.toString());
                if (i != 10) {
                    answer.append(i);
                    temp.setLength(0);
                }
                temp.append(c);
            }
        }
        if (temp.length() > 0) {
            answer.append(stringConverter(temp.toString()));
        }
        return Integer.parseInt(answer.toString());
    }

   static int stringConverter(String s) {

        if (s.equals("zero")) {
            return 0;
        } else if (s.equals("one")) {
            return 1;
        } else if (s.equals("two")) {
            return 2;
        } else if (s.equals("three")) {
            return 3;
        } else if (s.equals("four")) {
            return 4;
        } else if (s.equals("five")) {
            return 5;
        } else if (s.equals("six")) {
            return 6;
        } else if (s.equals("seven")) {
            return 7;
        } else if (s.equals("eight")) {
            return 8;
        } else if (s.equals("nine")){
            return 9;
        }
       return 10;
    }


    public static void main(String[] args) {
        solution("one4seveneight");
    }
}
