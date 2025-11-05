package ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FindanElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> number = new ArrayList<>();
        for(int i=0; i<num; i++){
            number.add(sc.nextInt());
        }
        System.out.println(number.get(2));

    }
}
