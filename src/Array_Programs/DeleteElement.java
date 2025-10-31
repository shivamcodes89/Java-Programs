package Array_Programs;

import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        int index = 3; // delete 4th element
        int[] arr1 = {2, 4, 5, 4, 1, 8, 9, 0, 3};
        int[] arr2 = new int[arr1.length - 1];

        // Copy elements before the deleted index
        for (int i = 0; i < index; i++) {
            arr2[i] = arr1[i];
        }

        // Shift and copy elements after the deleted index
        for (int i = index; i < arr1.length - 1; i++) {
            arr2[i] = arr1[i + 1];
        }

        // Print new array
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}

