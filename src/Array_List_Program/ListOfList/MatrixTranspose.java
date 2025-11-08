package Array_List_Program.ListOfList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> masterList = new ArrayList<>();
        System.out.print("enter row: ");
        int row = sc.nextInt();
        for(int i=0; i<row; i++){
            List<Integer> list = new ArrayList<>();
            System.out.print("enter column: ");
            int column = sc.nextInt();
            for(int j=0; j<column; j++){
                list.add(sc.nextInt());
            }
            masterList.add(list);
        }
        for(int i=masterList.size()-1; i>=0; i--){
            System.out.println(masterList.get(i));
        }
    }
}
