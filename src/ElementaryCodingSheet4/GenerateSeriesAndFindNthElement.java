package ElementaryCodingSheet4;

public class GenerateSeriesAndFindNthElement {
    public static void main(String[] args) {
        int input1 = 5;
        int input2 = -2;
        int input3 = -4;
        int input4 = 14;
        // 5,-2,-4,-11,-13,-20,-22,-29,-31,-38,-40,-47,-49,-56
        // output -> -56
        int a = input2 - input1;
        int b = input3 - input2;
        int[] arr = new int[input4];
        arr[0] = input1;
        arr[1] = input2;
        arr[2] = input3;
        for(int i=3; i<input4; i++){
            if(i % 2 == 1){
                arr[i] = arr[i-1] + a;
            }
            else{
                arr[i] = arr[i-1] + b;
            }
        }
        System.out.println(arr[input4-1]);
    }
}
