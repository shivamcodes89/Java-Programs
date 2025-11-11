package Set_Programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueElements {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<1 || num>1000){
            System.out.println("invalid");
            return;
        }
        else{
            for(int i=0; i<num; i++){
                int element = sc.nextInt();
                if(element<0 || element>10000){
                    System.out.println("invalid");
                    return;
                }
                else{
                    set.add(element);
                }
            }
        }
        System.out.println(set);
    }
}
