package Array_List_Program;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class LibraryBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<String> list = new ArrayList<>();
        for(int i=0; i<num; i++){
            list.add(sc.next());
        }
        String outDateBook = sc.next();
        list.remove(outDateBook);
        System.out.println(list);

        int update = sc.nextInt();
        String updateBook = sc.next();
        list.set(update, updateBook);
        System.out.println(list.size());
        System.out.println(list);
    }
}
