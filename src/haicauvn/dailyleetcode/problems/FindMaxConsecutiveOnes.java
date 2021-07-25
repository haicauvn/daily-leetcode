package haicauvn.dailyleetcode.problems;

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        FindMaxConsecutiveOnes solution = new FindMaxConsecutiveOnes();
        System.out.println(solution.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (var i : nums) {
            if (i == 1) {
                count++;
                max = count > max ? count : max;
            } else {
                count = 0;
            }
        }
        return max;
    }
}
