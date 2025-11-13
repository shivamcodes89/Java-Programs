package String_Programs;

import java.util.Scanner;

public class FindLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        sc.nextLine();
        String name2 = sc.nextLine();
        System.out.println(name1.length());
        System.out.println(name2.length());
    }
}
