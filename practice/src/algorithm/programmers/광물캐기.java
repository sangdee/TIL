package algorithm.programmers;

public class 광물캐기 {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int mineralIndex = 0;
        for (int i = 0; i < picks.length; i++) {
            if (picks[i] != 0) {
                for (int j = 0; j < picks[i]; j++) {
                    for (int k = 0; k < 5; k++) {
                        if (mineralIndex == minerals.length) {
                            break;
                        }
                        String mineral = minerals[mineralIndex];
                        mineralIndex++;
                        answer = updateWorkLevel(i, answer, mineral);
                    }
                }
            }
        }
        return answer;
    }

    private static int updateWorkLevel(int i, int answer, String mineral) {
        if (i == 0) {
            answer++;
        } else if (i == 1) {
            if (mineral.equals("diamond")) {
                answer += 5;
            } else {
                answer++;
            }
        } else {
            if (mineral.equals("diamond")) {
                answer += 25;
            } else if (mineral.equals("iron")) {
                answer += 5;
            } else {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        광물캐기 광물캐기 = new 광물캐기();
        System.out.println(광물캐기.solution(new int[]{0, 1, 1}, new String[]{"diamond", "diamond", "diamond", "diamond", "diamond", "iron", "iron", "iron", "iron", "iron", "diamond"}));

    }
}
