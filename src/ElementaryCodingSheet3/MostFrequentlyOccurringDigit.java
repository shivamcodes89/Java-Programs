package ElementaryCodingSheet3;

public class MostFrequentlyOccurringDigit {
    public static void main(String[] args) {
        int[] arr = {1237, 202, 666, 140};
        int[] arr1 = new int[10];
        int maxdigit = -1;
        int index = -1;
        for(int num : arr){
            while(num > 0){
                int digit = num % 10;
                arr1[digit]++;
                num = num / 10;
            }
            for(int i=0; i<arr1.length; i++){
                if(arr1[i] > maxdigit){
                    maxdigit = arr1[i];
                    index = i;
                }
                else if(arr1[i] == maxdigit && i > index){
                    index = i;
                }
            }
        }
        System.out.println(index);
    }
}