package Set_Programs;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveSpecificElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new LinkedHashSet<>();
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            String element = sc.next();
            set.add(element);
        }
        System.out.print("enter remove element: ");
        String remove = sc.next();
        set.remove(remove);
        System.out.println(set);
    }
}
