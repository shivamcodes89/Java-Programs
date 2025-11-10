package Set_Programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // set = no duplicate
        //  set - 1. HashSet, 2.LinkedHashSet, 3.TreeSet
        // HashSet - no order matter
        // LinkedHashSet - order matter
        // TreeSet - Elements sorted(ascending order)
        Set<Integer> set = new LinkedHashSet<>();
        set.add(11);
        set.add(10);
        set.add(22);
        set.add(35);
        set.add(11);
        set.add(22);
        System.out.println(set);
    }
}
