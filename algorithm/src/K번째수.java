/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-09-16 오전 12:17
 */
public class K번째수 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0], end = commands[i][1], k = commands[i][2], index = 0;
            int[] temp = new int[end - start + 1];

            for (int j = start - 1; j < end; j++) {
                temp[index++] = array[j];
            }
            quickSort(temp, 0, temp.length - 1);
            answer[i] = temp[k - 1];
        }
        return answer;
    }

    static void quickSort(int[] data, int start, int end) {
        if (start >= end) return;
        int key = start;
        int i = start + 1, j = end, temp;
        while (i <= j) {
            while (i <= end && data[i] <= data[key]) {
                i++;
            }
            while (j > start && data[j] > data[key]) {
                j--;
            }
            if (i > j) {
                temp = data[j];
                data[j] = data[key];
                data[key] = temp;
            }
            if (i < j) {
                temp = data[j];
                data[j] = data[i];
                data[i] = temp;
            }
        }
        quickSort(data, start, j - 1);
        quickSort(data, j + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] com = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(solution(arr, com));
    }

}
