package haicauvn.dailyleetcode.array;

public class _387_First_Unique_Character_in_a_String {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }

    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();

        // value of [a-z] characters = [97-122]
        int[] counter = new int[123];

        for (int i : arr) {
            counter[i]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (counter[arr[i]] == 1) {
                return i;
            }
        }
        return -1;
    }
}
