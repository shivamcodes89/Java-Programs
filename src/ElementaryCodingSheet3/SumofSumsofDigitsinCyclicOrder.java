package ElementaryCodingSheet3;

import java.util.Scanner;

public class SumofSumsofDigitsinCyclicOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();
        String str = Integer.toString(num);
        int total = 0;
        for(int i=0; i<str.length(); i++){
            int sum = 0;
            for(int j=i; j<str.length(); j++){
                sum = sum + (str.charAt(j) - '0');
            }
            total = total + sum;
        }
        System.out.println(total);
    }
}
