package Array_List_Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class To_DoTaskTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<String> task = new ArrayList<>();
        for(int i=0; i<num; i++){
            task.add(sc.next());
        }
        String completedTask = sc.next();
        task.remove(completedTask);
        String update = sc.next();
        String str = sc.next();
        task.set(task.indexOf(update), str);
        System.out.println(task);
        System.out.println(task.size());
    }
}
