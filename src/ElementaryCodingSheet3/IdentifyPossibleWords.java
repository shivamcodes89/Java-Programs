package ElementaryCodingSheet3;
public class IdentifyPossibleWords {
    public static void main(String[] args) {
        String input1 = "Fi_er";
        String input2 = "Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer";

        String[] arr = input2.split(":");
        input1 = input1.toLowerCase();
        String result = "";

        for(String word : arr){
            word = word.toLowerCase();
            boolean flag = true;

            if(input1.length() != word.length()){
                continue;
            }

            for(int i=0; i<word.length(); i++){
                char a = input1.charAt(i);
                char b = word.charAt(i);

                if(a == '_') continue;   // allow anything

                if(a != b){
                    flag = false;
                    break;
                }
            }

            if(flag){
                if(!result.isEmpty()) result += ":";
                result += word.toUpperCase();
            }
        }

        if(result.isEmpty()){
            result = "ERROR-009";
        }

        System.out.println(result);
    }
}
