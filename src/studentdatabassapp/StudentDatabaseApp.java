package studentdatabassapp;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentDatabaseApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        
        System.out.print("Enter the number of students to enroll: ");
        int num = in.nextInt();
        
        for (int i = 1; i <= num; i++) {
            System.out.println("\nPlease enter info for Student" + i);
            students.add(new Student());
        }
        
        System.out.println("\n" + students.toString());
    }

}
