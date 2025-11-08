package Array_List_Program.ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        List<String> list = new ArrayList<>();
        for(int i=0; i<number; i++){
            list.add(sc.next());
        }
       Collections.reverse(list);
        System.out.println(list);
    }
}
