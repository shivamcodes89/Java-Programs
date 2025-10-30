package Array_Programs;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 13, 22, 5, 0, 8, -2, -5};
        int evenElement = 0;
        int oddElement = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                evenElement++;
            }
            else{
                oddElement++;
            }
        }
        System.out.println("Even Element: " + evenElement);
        System.out.println("Odd Element: " + oddElement);
    }
}
