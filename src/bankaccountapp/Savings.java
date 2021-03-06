package bankaccountapp;

import java.util.Random;

// Saving account holders are given a Safety Deposit Box, identified by a 3-digit 
// number and accessed with a 4-digit code
public class Savings extends Account {
    // List properties specific to Savings
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;
    
    // Constructor to initialize settings for the savings properties
    public Savings (String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }
    
    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25;
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
