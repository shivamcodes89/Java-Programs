package ElementaryCodingSheet2;

import java.util.Scanner;

public class frequencyAllNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();
        int[] fre = new int[10];
        while(num > 0){
            int digit = num % 10;
            fre[digit]++;
            num = num / 10;
        }
        for(int i=0; i<fre.length; i++){
            if(fre[i] > 0){
                System.out.println("fre of " + i + " is: " + fre[i]);
            }
        }
    }
}
