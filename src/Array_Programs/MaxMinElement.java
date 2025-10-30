package Array_Programs;

import java.util.Scanner;

public class MaxMinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            System.out.print("enter array element: ");
            arr[i] = sc.nextInt();
        }
        // for Maximum
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("maximum element: " + max);

        // for minimum
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("minimum element: " + min);
    }
}
