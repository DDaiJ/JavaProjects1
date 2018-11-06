package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {
        List<Account> accountList = new LinkedList<Account>();
        
        String file = "/Users/dai/Documents/UW/Spring18/CSE373/JavaProjects1/"
                + "src/utilities/NewBankAccounts.csv";

        // Read users from a .csv file
        List<String[]> newAccount = utilities.CSV.read(file);
        for (String[] account : newAccount) {
            String name = account[0];
            String sSN = account[1];
            String accountType = account[2];
            double initBalance = Double.parseDouble(account[3]);
            
            if (accountType.equals("Savings")) {
                accountList.add(new Savings(name, sSN, initBalance));
            } else if (accountType.equals("Checking")) {
                accountList.add(new Checking(name, sSN, initBalance));
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }
        
        for (Account acc : accountList) {
            acc.showInfo();
            System.out.println("***********\n");
        }
    }

}
