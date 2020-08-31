import java.util.Arrays;

class UnfinishPalyer {
    public static String solution(String[] participant, String[] completion) {
        String answer;
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        System.out.println(Arrays.toString(participant));
        System.out.println(Arrays.toString(completion));
        for (i = 0; i < completion.length; i++) {
            if (!(participant[i].equals(completion[i]))) {
                answer = participant[i];
                return answer;
            }else if(i == completion.length- 1){
                System.out.println(participant[i+1]);
                return answer = participant[i+1];
            }
        }

        return participant[i];
    }

    public static void main(String[] args) {
        String[] part = {"leo", "kiki", "eden"};
        String[] com = {"eden", "kiki"};

        System.out.println(solution(part, com));
    }
}