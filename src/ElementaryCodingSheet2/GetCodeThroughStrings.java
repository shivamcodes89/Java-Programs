package ElementaryCodingSheet2;

import java.util.Scanner;
public class GetCodeThroughStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int totalDigit = 0;
        int pin = 0;
        for(String word : arr){
            int digitInWord = word.length();
            totalDigit = totalDigit + digitInWord;
        }
        for(int i=0; i<5; i++){
            int oneDigit = totalDigit % 10;
            totalDigit = totalDigit / 10;
            pin = pin + oneDigit;
        }
        System.out.println(pin);
    }
}
