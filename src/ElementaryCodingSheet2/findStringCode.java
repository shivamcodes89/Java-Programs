package ElementaryCodingSheet2;

import java.util.Scanner;
public class findStringCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word : words){
            int sum = 0;
            int left = 0;
            int right = word.length() - 1;

            while(left <= right){
                int a = word.charAt(left) - 'A' + 1;
                int b = word.charAt(right) - 'A' + 1;
                sum += Math.abs(a - b);
                left++;
                right--;
            }

            // har word ka 3-digit format
            result.append(String.format("%03d", sum));
        }

        System.out.println(result.toString());
    }
}
