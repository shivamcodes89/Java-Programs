package Array_List_Program.ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DisplayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<String> element = new ArrayList<>();
        for(int i=0; i<num; i++){
            element.add(sc.next());
        }
        for(int i=0; i<element.size(); i++){
            System.out.println(element.get(i));
        }
    }
}
