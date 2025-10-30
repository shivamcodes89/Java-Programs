package Array_Programs;

import java.util.Scanner;
import java.util.Arrays;

public class SecondMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            System.out.print("enter array element: ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr) + " ");
        System.out.println("second last: " + arr[arr.length-2]);
    }
}
