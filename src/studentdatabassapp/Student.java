package studentdatabassapp;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private static int costOfCourse = 600;
    private ArrayList<String> courses = new ArrayList<String>();
    private int tuitionBalance = 0;
    private static int id = 1000;
    
    // Constructor: prompt user to enter the name and year for each student
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();
        
        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();
        
        System.out.print("\n1 - Freshman\n2 - Sophmore\n3 - Junior \n4 - Senior\n"
                + "Enter student's grade year: ");
        this.gradeYear = in.nextInt();
        
        generateID();
        enroll();
        payTuition();
        
    }
    
    //generate a unique ID for each student (first number being their grade level)
    private void generateID() {
        id++;
        this.studentID =  "" + gradeYear + id;
    }
    
    //enroll in courses
    public void enroll() {
        String course = "";
        Scanner in = new Scanner(System.in);
        
        while(!course.equals("Q")) {
            System.out.print("Enter course to enroll (Q to quit): ");
            course = in.nextLine();
            if (!course.equals("Q")) {
                courses.add(course);
                tuitionBalance = tuitionBalance + costOfCourse;
            }
        }
        
        System.out.println("ENROLLED IN:" + courses.toString());
        System.out.println("TUITION BALANCE: $" + tuitionBalance + "\n");
    }
     
    //view balance
    public void viewBalance() {
        System.out.println("Your tuition balance is $" + tuitionBalance);
    }
    
    //pay tuition
    public void payTuition() {
        System.out.println("Do you want to pay the tuition now?\n"
                + "1 - YES\n2- NO");
        Scanner in = new Scanner(System.in);
        int pay = in.nextInt();
        if(pay == 1) {
            System.out.print("Enter your payment: $");
            int payment = in.nextInt();
            tuitionBalance = tuitionBalance - payment;
            System.out.println("Thank you for payment of $" + payment);
        }
        viewBalance();
    }
    
    //display student status: name, ID, courses enrolled, and balance
    public String toString() {
        return "Student Name: " + firstName + " " + lastName 
                + "\nStudent ID: " + studentID + "\nCourses Enrolled: "
                + courses.toString() + "\nTuition Balance: $" + tuitionBalance
                + "\n";
    }
}
