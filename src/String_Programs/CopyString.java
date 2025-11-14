package String_Programs;

public class CopyString {
    public static void main(String[] args) {
        String name1 = "Arjit rajput";
        //1. // String name2 = name1;

        //2. //String name2 = new String(name1);

        //3.
        String name2 = "";
        for(int i=0; i<name1.length()-1; i++){
            name2 = name1 + name1.charAt(i);
        }
        System.out.println(name2);
    }
}
