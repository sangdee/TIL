package lecture.binary_search;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/07
 */
public class 이진탐색 {
    public static int binarySearchRecursion(int[] arr, int target, int start, int end) {
        if (start > end)
            return -1;
        int mid = (start + end) / 2;
        if (arr[mid] == target)
            return mid;
        else if (arr[mid] > target) {
            return binarySearchRecursion(arr, target, start, mid - 1);
        } else {
            return binarySearchRecursion(arr, target, mid + 1, end);
        }
    }

    public static int binarySearchWhile(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
