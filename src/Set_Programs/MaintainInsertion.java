package Set_Programs;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class MaintainInsertion {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            String str = sc.next();
            set.add(str);
        }
        System.out.println(set);
    }
}
