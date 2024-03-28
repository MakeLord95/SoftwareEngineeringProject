package SEP1;

public class BinarySearch {
    public static int search(int[] a, int x) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (a[mid] == x) {
                return mid;
            } else if (a[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static int checkedSearch(int[] a, int x) {
        int index = search(a, x);
        if (index != -1) {
            return index;
        } else {
            throw new IllegalArgumentException("Element not found in the array");
        }
    }
}
