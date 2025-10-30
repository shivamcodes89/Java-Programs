package Array_Programs;

import java.util.Scanner;

public class SumAllElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            System.out.print("enter array element: ");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<num; i++){
            sum += arr[i];
        }
        System.out.println("sum is: " + sum);
    }
}
