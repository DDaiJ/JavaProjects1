package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaltPasswordLength = 8;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;
    private String email;
    private String companySuffix = ".dreamcompany.com";

   // Constructor to receive first name and last name
   public Email(String firstName, String lastName) {
       this.firstName = firstName;
       this.lastName = lastName;
       System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
       
       // Call a method to set department
       this.department = setDepartment();
       System.out.println("Department: " + this.department);
       
       // Generate a default email address
       this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" 
               + department.toLowerCase() + companySuffix;
       this.alternateEmail = email;
       System.out.println("\nYour Email Address is: " + email);
       
       // Call a method to generate random password
       this.password = generatePassword(defaltPasswordLength);
       System.out.println("This is the password for your email account: " + this.password); 
       
   }
   
   public String generatePassword(int length) {
       String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
       char[] password = new char[length];
       for (int i = 0; i < length; i++) {
           int rand = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
       }
       
       return String.valueOf(password);
   }
   
   public String setDepartment() {
       System.out.print("DEPARTMENT CODES\n 1 for "
               + "Sales\n2 for Development\n3 for Accounting\n0 for None\n"
               + "Enter your Department Code:");
       Scanner in = new Scanner(System.in);
       int depChoice = in.nextInt();
       if (depChoice == 1) { return "Sales"; }
       else if (depChoice == 2) { return "Development"; }
       else if (depChoice == 3) { return "Accounting"; }
       else { return ""; }
   }
   
   //change the password, set the mailbox capacity, and define an alternate email address
   public void changePassword(String password) {
       this.password = password;
   }
   
   public void setAlternateEmail(String newEmail) { 
       this.alternateEmail = newEmail;
       
   }
   
   public void setMailboxCapacity(int capacity) {
       this.mailboxCapacity = capacity;
   }
   
   //display the name, email, and mailbox capacity
   public String getName() {
       return this.firstName + " " + this.lastName;
   }
   
   public String getEmail() {
       return alternateEmail;
   }
   
   public int getCapacity() {
       return mailboxCapacity;
   }
   
   public String getPassword() {
       return password;
   }
   
   // show name, email, emailCapacity
   public String showInfo() {
       return "Display Name: " + getName() + "\nEmail Address: "
               + getEmail() + "\nPassword: " + getPassword() +
               "\nYour Email Capacity is: " + getCapacity() + "mb";
   }
}
