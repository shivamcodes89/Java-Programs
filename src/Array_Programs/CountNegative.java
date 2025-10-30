package Array_Programs;

public class CountNegative {
    public static void main(String[] args) {
        int[] arr = {0, -4, 7, -6, -3, 7, -8, 0, 4};
        System.out.print("negative element: ");
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){

                System.out.print(arr[i] + " ");
            }
        }
    }
}
