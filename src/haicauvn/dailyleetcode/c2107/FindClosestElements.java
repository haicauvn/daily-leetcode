package haicauvn.dailyleetcode.c2107;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindClosestElements {
    public static void main(String[] args) {
        FindClosestElements solution = new FindClosestElements();
        System.out.println(solution.findClosestElements(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15}, 4, 5));
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        for (var i : arr) {
            result.add(Integer.valueOf(i));
        }

        // sort using custom comparator
        Collections.sort(result, (num1, num2) -> Math.abs(num1 - x) - Math.abs(num2 - x));

        // Only take k elements
        result = result.subList(0, k);

        // Sort again to have output in ascending order
        Collections.sort(result);
        return result;
    }
}
