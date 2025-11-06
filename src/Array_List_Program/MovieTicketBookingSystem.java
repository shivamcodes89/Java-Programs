package Array_List_Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<String> customerName = new ArrayList<>();
        for(int i=0; i<num; i++){
            customerName.add(sc.next());
        }
        String cancelled = sc.next();
        customerName.remove(cancelled);

        String incorrect = sc.next();
        String correct = sc.next();
        customerName.set(customerName.indexOf(incorrect), correct);
        int show = sc.nextInt();
        System.out.println(customerName.get(show));
    }
}
