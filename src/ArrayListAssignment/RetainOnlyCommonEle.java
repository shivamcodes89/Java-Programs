package ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class RetainOnlyCommonEle {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(30, 40, 50, 60));

        List<Integer> common = new ArrayList<>();
        for(int i = 0; i < list1.size(); i++){
            if(list2.contains((list1.get(i)))){
                common.add(list1.get(i));
            }
        }
        System.out.println(common);
    }
}
