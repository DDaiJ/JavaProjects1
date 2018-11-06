package bankaccountapp;

import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {
        String file = "/Users/dai/Documents/UW/Spring18/CSE373/JavaProjects1/"
                + "src/utilities/NewBankAccounts.csv";
        /*
        Checking savacc1 = new Checking("Jessica Dai", "129394332", 1500);
        Savings chkacc1 = new Savings("Tom Smith", "322223333", 2000);
        // Read a CSV file then create new accounts based on that data
        
        savacc1.showInfo();
        System.out.println("***********");
        chkacc1.showInfo();
        System.out.println("***********");
        savacc1.deposit(600);
        savacc1.withdraw(299.3);
        savacc1.transfer("Hans", 1000);
        savacc1.compound();
        */
        
        // Read users from a .csv file
        List<String[]> newAccount = utilities.CSV.read(file);
        for (String[] account : newAccount) {
            System.out.println("NEW ACCOUNT: ");
            if (account[2].equals("Savings")) {
                
            } else if (account[2].equals("Savings")) {
                
            }dd
        }
    }

}
