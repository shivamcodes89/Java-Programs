package Array_List_Program;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class OnlineCourseEnrollment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> courseName = new ArrayList<>();
        for(int i=0; i<5; i++){
            courseName.add(sc.next());
        }
        String droppedCourse = sc.next();
        courseName.remove(droppedCourse);

        System.out.print("update course: ");
        String update = sc.next();
        String updated = sc.next();
        courseName.set(courseName.indexOf(update), updated);

        System.out.println(courseName);
        System.out.println(courseName.get(sc.nextInt()));
    }
}
