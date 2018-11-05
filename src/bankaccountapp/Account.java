package bankaccountapp;

import java.util.Random;

// Both accounts will use an interface that determines the base interest rate
// - Saving accounts will use .25 points less than the base rate
// - Checking accounts will use 15% of the base rate

public abstract class Account implements IBaseRate{
    // we use abstract class because we won't be creating Account object in main.
    // Account is the super class, being called before calling checking and savings.
    
    // List common properties for savings and checking account
    String name;
    String sSN;
    double balance;
    
    String accountNumber;
    // 11-Digit Account Number (generated with the following process: 1 or 2 depending 
    // on Savings or Checking, last two digits of SSN, unique 5- digit number, 
    // and random 3-digit number)
    double rate;
    static int index = 10000;
    
    // Constructor to set base properties and initialize the account.
    public Account(String name, String sSN, double initBalance) {
        this.name = name;
        this.sSN = sSN;
        this.balance = initBalance;
 
        index++;
        //set account number
        this.accountNumber = setAccountNumber();
        
    }
    
    // List common methods
    private String setAccountNumber() {
        String lastTwoSSN = sSN.substring(sSN.length() - 2);
        int uniqueID = index;
        Random rand = new Random();
        int random = (int) (rand.nextInt(899) + 100); // generate a random 3-digit integer
        return lastTwoSSN + uniqueID + random;
    }
    
    public void showInfo() {
        System.out.println(
                "NAME: " + name +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: " + balance
                );
    }
}
