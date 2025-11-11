package Set_Programs;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortNumbers {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num <= 1 || num >= 100){
            System.out.println("Invalid");
            return;
        }
        else{
            for(int i=0; i<num; i++){
                int element = sc.nextInt();
                set.add(element);
            }
        }
        System.out.println(set);
    }
}
