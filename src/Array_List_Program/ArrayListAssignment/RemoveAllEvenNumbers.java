package Array_List_Program.ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class RemoveAllEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<num; i++){
            list.add(sc.nextInt());
        }
        List<Integer> list1=new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            if(list.get(i)%2!=0){
                list1.add(list.get(i));
            }
        }
        System.out.println(list1);
    }
}
