
public class Largest {
    public static int largest(int[] list) {
        int max = Integer.MIN_VALUE;
        if (list.length == 0)
            throw new IllegalArgumentException("Array is Empty");
        for (int index : list) {
            if (index > max) max = index;
        }
        return max;
    }
}
