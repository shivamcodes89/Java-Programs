package Array_List_Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StudentAttendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> studentName = new ArrayList<>();
        for(int i=1; i<=4; i++){
            studentName.add(sc.next());
        }
        System.out.print("absent student is: ");
        String absentStudent = sc.next();
        studentName.remove(absentStudent);
        studentName.set(studentName.indexOf("shivm"), "Shivam");
        System.out.println(studentName);

    }

}
