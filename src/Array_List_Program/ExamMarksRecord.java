package Array_List_Program;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class ExamMarksRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<num; i++){
            list.add(sc.nextInt());
        }
        int galat = sc.nextInt();
        int right = sc.nextInt();
        list.set(list.indexOf(galat), right);
        System.out.println(list);
    }
}
