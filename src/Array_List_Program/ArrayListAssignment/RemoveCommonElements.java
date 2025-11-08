package Array_List_Program.ArrayListAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveCommonElements {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 6));

        for (int i = list1.size() - 1; i >= 0; i--) {
            if (list2.contains(list1.get(i))) {
                // contains return type true/false.
                list1.remove(i);
            }
        }

        System.out.println(list1); // Output: [1, 2, 5]
    }
}
