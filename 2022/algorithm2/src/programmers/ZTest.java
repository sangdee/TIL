package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/09
 */
public class ZTest {
    //등차수열의 합 공식[n(a+l)/2]을 이용하여 정답을 계산하고 출력한다.
    public long solution(long n) {
        // long answer = 0;
        // answer = (n - 1) * (n + 1 + (n + 1) * (n - 1)) / 2;

        return (n - 1) * (n + 1 + (n + 1) * (n - 1)) / 2;
    }

    public static int solution(int[] histogram) {
        int max = 0;
        for (int i = 0; i < histogram.length; i++) {
            int start = histogram[i];
            for (int j = i + 2; j < histogram.length; j++) {
                int end = histogram[j];
                int water = Math.min(start, end) * (j - i - 1);
                if (max < water) {
                    max = water;
                }
            }

        }
        return max;
    }

    public static void main(String[] args) {
        solution(new int[][] {{1, 0, 3}, {2, 1, 3}, {3, 3, 2}, {4, 9, 1}, {5, 10, 2}});
    }

    public static int[] solution(int[][] data) {
        int length = data.length;
        int[] answer = new int[length];
        PriorityQueue<Print> pq = new PriorityQueue<>();
        List<Print> list = new ArrayList<>();

        for (int i = 1; i < length; i++) {
            list.add(new Print(data[i][0], data[i][1], data[i][2]));
        }
        pq.offer(new Print(data[0][0], data[0][1], data[0][2]));
        Integer executeTime = data[0][1];
        Integer extractedTime = extracted(answer, pq, list, executeTime);
        while (!list.isEmpty()) {
            List<Print> temp = new ArrayList<>();
            Print print = list.get(0);
            pq.offer(print);
            temp.add(print);
            list.removeAll(temp);
            extractedTime = extracted(answer, pq, list, extractedTime);
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    private static Integer extracted(int[] answer, PriorityQueue<Print> pq, List<Print> list, Integer executeTime) {
        while (!pq.isEmpty()) {
            Print print = pq.poll();
            executeTime += print.getNumOfPage();

            for (int i = 0; i < answer.length; i++) {
                if (answer[i] == 0) {
                    answer[i] = print.getDocNum();
                    break;
                }
            }
            List<Print> temp2 = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (executeTime == list.get(i).getTime()) {
                    Print print1 = list.get(i);
                    pq.offer(print1);
                    temp2.add(print1);
                    break;
                }
            }
            if (!temp2.isEmpty()) {
                list.removeAll(temp2);
                continue;
            }
            List<Print> tempPrint = new ArrayList<>();
            if (!list.isEmpty()) {
                for (Print f : list) {
                    if (executeTime > f.getTime()) {
                        pq.offer(f);
                        tempPrint.add(f);
                    }
                }
            }
            list.removeAll(tempPrint);
        }
        return executeTime;
    }

    static class Print implements Comparable<Print> {
        private int docNum;
        private int time;
        private int numOfPage;

        public int getDocNum() {
            return docNum;
        }

        public int getTime() {
            return time;
        }

        public int getNumOfPage() {
            return numOfPage;
        }

        public Print(int docNum, int time, int numOfPage) {
            this.docNum = docNum;
            this.time = time;
            this.numOfPage = numOfPage;
        }

        @Override
        public int compareTo(Print other) {
            if (this.numOfPage < other.numOfPage) {
                return -1;
            }
            if (this.numOfPage == other.numOfPage) {
                if (this.time < other.time) {
                    return -1;
                }
            }

            return 1;
        }
    }
}
