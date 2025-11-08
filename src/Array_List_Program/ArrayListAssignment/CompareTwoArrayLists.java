package ArrayListAssignment;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class CompareTwoArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<num; i++){
            list.add(sc.nextInt());
        }
        List<Integer> list1 = new ArrayList<>();
        for(int i=0; i<num; i++){
            list1.add(sc.nextInt());
        }
        if(list.equals(list1)){
            System.out.println("equals list and list1");
        }
        else{
            System.out.println("not equal");
        }
    }
}
