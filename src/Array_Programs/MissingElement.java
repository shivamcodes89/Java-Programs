package Array_Programs;

public class MissingElement {
    public static void main(String[] args) {
        int[] arr1 = {56, 74, 98, 52, 84, 75, 67, 43};
        int[] arr2 = {67, 74, 56, 98, 84, 75, 43};
        for(int i=0; i<arr1.length; i++){
            boolean found = false;
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Missing Element: " + arr1[i]);
            }
        }
    }
}
