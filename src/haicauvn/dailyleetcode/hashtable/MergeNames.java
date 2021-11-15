package haicauvn.dailyleetcode.hashtable;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MergeNames {
    public static String[] uniqueNames(String[] names1, String[] names2) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        Set<String> set = new LinkedHashSet<>();
        for(String name : names1) {
            set.add(name);
        }
        for(String name : names2) {
            set.add(name);
        }
        return set.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
