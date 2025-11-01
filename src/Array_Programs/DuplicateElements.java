package Array_Programs;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 2, 1, 6, 2, 6, 2, 1, 7, 5, 7, 9, 8};
        int[] freq = new int[arr.length];
        int visited = -1;
        for(int i=0; i<arr.length; i++){
            int count = 1;
            for(int j=1+i; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    freq[j] = visited;
                }
            }
            if(freq[i] != visited){
                freq[i] = count;
            }
        }
        for(int i=0; i<freq.length; i++){
            if(freq[i] != visited && freq[i] != 1){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
