package ElementaryCodingSheet4;

public class CalculateSumOfNonPrimeIndexValues {
    public static void main(String[] args) {
        //Que-> example1= {10,20,30,40,50,60,70,80,90,100} -> 10+20+50+70+90+100 = 340;
        //Que-> example2= {-1,-2,-3,3,4,-7} -> -1+(-2)+4 = 1;
        int[] arr = {-1,-2,-3,3,4,-7};
        int len = arr.length;
        int total = 0;
        for(int i=0; i< arr.length; i++){
            if(!cheqprime(i)){
                total = total + arr[i];
            }
        }
        System.out.println(total);
    }
    public static boolean cheqprime(int num){
        if(num==0 || num==1){
            return false;
        }
        else{
            for(int i=2; i<=num/2; i++){
                if(num%i==0) {
                    return false;
                }
            }
            return true;
        }
    }
}
