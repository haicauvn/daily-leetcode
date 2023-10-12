package haicauvn.dailyleetcode.leetcode75;

public class _11_ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            int area = (right - left) * (height[left] < height[right] ? height[left] : height[right]);
            if (area > maxArea) {
                maxArea = area;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        maxArea(new int[] { 1, 2, 4, 3 }); // 4
        maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }); // 49
        maxArea(new int[] { 1, 1 }); // 1
    }
}
