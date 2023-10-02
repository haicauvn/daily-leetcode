package haicauvn.dailyleetcode.array;

import java.util.Arrays;

public class _27_Remove_Element {
    public static void main(String[] args) {
        int[] a = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(removeElement(a, 2));
        System.out.println(Arrays.toString(a));
    }

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n; ) {
            if (nums[i] == val) {
                for (int j = i; j < n-1; j++) {
                    nums[j] = nums[j+1];
                }
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
}
