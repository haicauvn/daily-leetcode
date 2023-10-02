package haicauvn.dailyleetcode.array.twopointers;

import java.util.Arrays;

public class _27_Remove_Element {
    public static void main(String[] args) {
        int[] a = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(removeElement(a, 2));
        System.out.println(Arrays.toString(a));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}
