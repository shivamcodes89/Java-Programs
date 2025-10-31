package Array_Programs;

import java.util.Arrays;
public class InsertElement {
    public static void main(String[] args) {
        int element = 88;
        int index = 4;
        int[] arr1 = {2, 4, 5, 4, 1, 8, 9, 0, 3};
        int[] arr2 = Arrays.copyOf(arr1, arr1.length+1);
        for(int i=arr1.length-1; i >= index; i--){
            arr2[i+1] = arr1[i];
        }
        arr2[index] = element;
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
