package Array_Programs;

import java.util.Arrays;

public class CopyArrayAnotherArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, -2, 0, 4, 9};
        int[] copy = Arrays.copyOf(arr, 7);
        System.out.print("old array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("copy array: ");
        for(int i=0; i<copy.length; i++){
            System.out.print(copy[i] + " ");
        }
    }
}
