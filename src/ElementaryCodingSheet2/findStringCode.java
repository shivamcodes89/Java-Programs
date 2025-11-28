package ElementaryCodingSheet2;

import java.util.Scanner;
public class findStringCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String result = "";
        for(String word : arr){
            word = word.toUpperCase();
            int i = 0;
            int j = word.length() - 1;
            int sum = 0;
            while (i < j){
                int left = word.charAt(i) - 'A' + 1;
                int right = word.charAt(j) - 'A' + 1;
                sum = sum +  Math.abs(left - right);
                i++;
                j--;
            }
            if(i == j){
                sum = sum + (word.charAt(i) - 'A' + 1);
            }
            result = result + sum;
        }
        System.out.println(Integer.parseInt(result));
    }
}