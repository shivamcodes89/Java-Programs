package ElementaryCodingSheet3;

public class SumofPowersofDigits {
    public static void main(String[] args) {
        int num = 582109;
        String str = String.valueOf(num);
        int sum = 0;
        int nextDigit ;
        for (int i = 0 ;i<str.length();i++){
            int currDigit = str.charAt(i)-'0';
            if(i==(str.length()-1)){
                nextDigit = 0;
            }else{
                nextDigit = str.charAt(i+1)-'0';
            }
            sum+=Math.pow(currDigit,nextDigit);
        }
        System.out.println(sum);
    }
}
