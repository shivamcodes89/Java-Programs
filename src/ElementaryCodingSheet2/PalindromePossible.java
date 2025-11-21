package ElementaryCodingSheet2;

import java.util.Scanner;

public class PalindromePossible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. Agar total digits EVEN ho -> koi bhi digit odd frequency ka nahi hona chahiye.
        //2. Agar total digits ODD ho -> sirf 1 digit odd frequency ka allowed hai.
        System.out.print("enter number: ");
        int num = sc.nextInt();
        int[] fre = new int[10];
        int totalDigit = 0;
        int num1 = 0;
        while(num > 0){
            int digit = num % 10;
            fre[digit]++;
            totalDigit++;
            num = num / 10;
        }
        for(int i=0; i< fre.length; i++){
            if(fre[i] % 2 != 0){
                num1++;
            }
        }
        if(totalDigit % 2 == 0){
            if(num1 == 0){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
        else{
            if(num1 == 1){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
}