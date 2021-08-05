package haicauvn.dailyleetcode.bsearch;

public class _704_Binary_Search {
    // Approach 1
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Approach 2: Recursion
    public static int search2(int[] nums, int target, int left, int right) {
        int mid = (left + right) / 2;
        if (left > right) {
            return -1;
        }
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return search2(nums, target, mid + 1, right);
        } else {
            return search2(nums, target, left, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, 4, 5, 6, 7, 9, 11, 23, 45, 67, 89 };
        System.out.println(search(arr, 5));
        System.out.println(search(arr, 11));
        System.out.println(search2(arr, 23, 0, arr.length - 1));
        System.out.println(search2(new int[] { 4 }, 4, 0, 1));
        System.out.println(search2(new int[] { -1, 0, 3, 5, 9, 12 }, 13, 0, 5));
    }
}
