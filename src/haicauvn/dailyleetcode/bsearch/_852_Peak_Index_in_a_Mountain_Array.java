package haicauvn.dailyleetcode.bsearch;

public class _852_Peak_Index_in_a_Mountain_Array {
    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[] { 0, 1, 0 }));
        System.out.println(peakIndexInMountainArray(new int[] { 0, 2, 1, 0 }));
        System.out.println(peakIndexInMountainArray(new int[] { 0, 10, 5, 2 }));
        System.out.println(peakIndexInMountainArray(new int[] { 3, 4, 5, 1 }));
        System.out.println(peakIndexInMountainArray(new int[] { 24, 69, 100, 99, 79, 78, 67, 36, 26, 19 }));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (right - left >= 2) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] > arr[mid - 1]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return -1;
    }
}
