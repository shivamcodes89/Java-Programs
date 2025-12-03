package ElementaryCodingSheet4;

import java.util.Scanner;

public class FindResultAfterAlternateAdd_subOnN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Que- N=7 , opt=1 -> Result = 7 – 6 + 5 – 4 + 3 – 2 + 1 = 4
                   //opt=2 -> Result = 7 + 6 – 5 + 4 – 3 + 2 - 1 = 10
        int N = 7;
        System.out.print("enter opt: ");
        int opt = sc.nextInt();
        int[] arr = new int[N];
        int num = N;
        for(int i=0; i<N; i++){
            arr[i] = num;
            num--;
        }

        int total = 0;
        if(opt == 1){
            for(int i=0; i<N; i++){
                if(i%2==0){
                    total = total + arr[i];
                }
                else{
                    total = total - arr[i];
                }
            }
        }
        else {
            for(int i=0; i<N; i++){
                if(i==0 || i==1){
                    total = total + arr[i];
                }
                else if(i%2==0){
                    total = total - arr[i];
                }
                else{
                    total = total + arr[i];
                }
            }
        }
        System.out.println(total);
    }
}
