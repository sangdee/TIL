package algorithm.leetcode;

public class MergeSortedArray {
    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];
        int currentIndex = 0;
        int leftIndex = 0, rightIndex = 0;

        while (leftIndex < m && rightIndex < n) {
            if (nums1[leftIndex] < nums2[rightIndex]) {
                arr[currentIndex] = nums1[leftIndex];
                leftIndex++;
            } else {
                arr[currentIndex] = nums2[rightIndex];
                rightIndex++;
            }
            currentIndex++;
        }
        while (leftIndex < m) {
            arr[currentIndex] = nums1[leftIndex];
            leftIndex++;
            currentIndex++;
        }
        while (rightIndex < n) {
            arr[currentIndex] = nums2[rightIndex];
            rightIndex++;
            currentIndex++;
        }

        nums1 = arr;
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }

        //        for (int i = 0; i < arr.length; i++) {
        //            nums1[i] = arr[i];
        //        }
    }
}
