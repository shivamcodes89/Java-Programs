package Set_Programs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckElement {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            set.add(sc.next());
        }
        System.out.print("enter check element: ");
        String check = sc.next();
        System.out.println(check + " is present in the set.");
    }
}
