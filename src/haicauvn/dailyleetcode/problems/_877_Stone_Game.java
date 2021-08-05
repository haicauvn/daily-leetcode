package haicauvn.dailyleetcode.problems;

import java.util.Arrays;
/**
 * https://leetcode.com/problems/stone-game/
 * LeetCoding Challenge
 */
public class _877_Stone_Game {
    public static void main(String[] args) {
        stoneGame(new int[] { 5, 3, 4, 5 });
    }

    public static boolean stoneGame(int[] piles) {
        Arrays.sort(piles);
        int alex = 0;
        int lee = 0;
        for (int i = piles.length - 1; i >= 0; i--) {
            alex += piles[i];
            lee += piles[--i];
        }
        // System.out.println(alex + "|" + lee);
        if (alex > lee) {
            return true;
        }
        return false;
    }
}
