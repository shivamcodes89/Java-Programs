package ArrayListAssignment;

import java.util.*;

public class SortStudentMarks {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(76, 89, 45, 67, 92, 55));

//        Collections.sort(list);  // Ascending sort
//        System.out.println("Sorted List (Ascending): " + list);

        List<Integer> sortList = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j< list.size(); i++){
                if(list.get(i) > list.get(j)){
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }
}
