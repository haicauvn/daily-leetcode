package haicauvn.dailyleetcode.c2107;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public static void main(String[] args) {
        GrayCode solution = new GrayCode();
        System.out.println(solution.grayCode(2));
    }

    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 1 << n; i++) {
            list.add(i ^ (i >> 1));
        }
        return list;
    }
}
