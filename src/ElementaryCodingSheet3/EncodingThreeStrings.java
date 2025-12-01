package ElementaryCodingSheet3;

import java.io.StringReader;
import java.util.Scanner;

public class EncodingThreeStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter input1: ");
        String input1 = sc.next();
        System.out.print("enter input 2: ");
        String input2 = sc.next();
        System.out.print("enter input 3: ");
        String input3 = sc.next();

        int index = 0;
        String[] arr = {input1, input2, input3};
        String[] arr1 = new String[3];
        String[] arr2 = new String[3];
        String[] arr3 = new String[3];
        for(String word : arr){
            int length = word.length();
            int rem = length % 3;
            int part = length / 3;
            int s = part; int m = part; int e = part;
            if(rem == 1){
                m = m + 1;
            }else if(rem == 2){
                s = s + 1;
                e = e + 1;
            }
            arr1[index] = word.substring(0, s);
            arr2[index] = word.substring(s, s+m);
            arr3[index] = word.substring(s+m);
            index++;
        }
        String output1 = arr1[0] + arr1[1] + arr1[2];
        String output2 = arr2[0] + arr2[1] + arr2[2];
        String output3 = arr3[0] + arr3[1] + arr3[2];

        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3.toUpperCase());
    }
}