package emailapp;
import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = in.next();
        System.out.print("Enter your last name: ");
        String lastName = in.next();
        Email eml = new Email(firstName, lastName);
        
        System.out.print("\nDo you want to alter your defalt email address?"
                + "\n1 for YES\n0 for NO\n>");
        int changeAddress = in.nextInt();
        if (changeAddress == 1) {
            System.out.print("Please type in your new email address: ");
            String newEmail = in.next();
            eml.setAlternateEmail(newEmail);
        }
        
        System.out.print("Do you want to change your password?"
                + "\n1 for YES\n0 for NO\n>");
        int changePass = in.nextInt();
        if (changePass == 1) {
            System.out.print("Type in your new password: ");
            String newPass = in.next();
            eml.changePassword(newPass);
        }
        
        System.out.print("How would you like your email capacity to be "
                + "(in MB)?\n>");
        int capacity = in.nextInt();
        eml.setMailboxCapacity(capacity);
        
        System.out.println("\nGreat! You're all set! "
                + "Here's the detailed info for your account.");
        
        System.out.println(eml.showInfo());
        
    }

}
