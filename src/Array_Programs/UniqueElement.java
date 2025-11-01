package Array_Programs;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5, 4, 4, 3, 2, 2, 3, 4, 9, 7, 6};
        int[] freq = new int[arr.length];
        int visited = -1;
        for(int i=0; i<arr.length; i++){
            int count = 1;
            for(int j=i+1; j<arr.length; j++){
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
            if(freq[i] == 1){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
