package Array_List_Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PlaylistManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> songName = new ArrayList<>();
        for(int i=1; i<5; i++){
            songName.add(sc.next());
        }
        songName.set(songName.indexOf("Ram"), "Shyam");
        songName.remove(sc.next());
        System.out.println(songName.size());
        System.out.println(songName);
    }

}
