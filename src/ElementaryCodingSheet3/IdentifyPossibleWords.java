package ElementaryCodingSheet3;

public class IdentifyPossibleWords {
    public static void main(String[] args) {
        String input1 = "Fi_er";
        String input2 = "Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer";
        String[] arr = input2.split(":");
        input1 = input1.toLowerCase();
        int index = input1.indexOf("_");//output -> filer, Fixer, fiber
        int length1 = input1.length();

        for(String word : arr){
            word = word.toLowerCase();
            int length2 = word.length();
            for(int i=0; i<arr.length; i++){
                if(length1 == length2){

                }
            }
        }
    }
}