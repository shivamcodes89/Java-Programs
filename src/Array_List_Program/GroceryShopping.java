package Array_List_Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<String> items = new ArrayList<>();
        for(int i=0; i<num; i++){
            items.add(sc.next());
        }
        String forgetItem = sc.next();
        items.add(2, forgetItem);

        String purchased = sc.next();
        items.remove(purchased);

        System.out.println(items);
    }
}
