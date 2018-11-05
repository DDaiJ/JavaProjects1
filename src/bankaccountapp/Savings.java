package bankaccountapp;

import java.util.Random;

// Saving account holders are given a Safety Deposit Box, identified by a 3-digit 
// number and accessed with a 4-digit code
public class Savings extends Account {
    // List properties specific to Savings
    int safetyDepositBoxID;
    int safetyDepositBoxKey;
    
    // Constructor to initialize settings for the savings properties
    public Savings (String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }
    
    // List any methods specific to savings account
    private void setSafetyDepositBox() {
        Random rand = new Random();
        safetyDepositBoxID = rand.nextInt(899) + 100;
        safetyDepositBoxKey = rand.nextInt(8999) + 1000;
    }
    
    
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println(
                "Your Savings Account Features" + 
                "\n  Safety Deposit Box ID: " + safetyDepositBoxID + 
                "\n  Safety Deposit Box Key: " + safetyDepositBoxKey
                );
    }
}
