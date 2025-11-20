package ElementaryCodingSheet2;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int number = sc.nextInt();
        System.out.println(checkPalindrome(number));
    }
    public static boolean checkPalindrome(int num){
        int n = num;
        int rev = 0;
        while(num > 0){
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }
        if(rev == n){
            return true;
        }else{
            return false;
        }
    }
}