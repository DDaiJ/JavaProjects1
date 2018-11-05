package bankaccountapp;

import java.util.Random;

//Checking Account holders are assigned a Debit Card with a 12-digit number
// and 4-digit PIN.
public class Checking extends Account {
    // List properties specific to a checking account.
    long debitCardNumber;
    int debitCardPin;
    
    
    // Constructor to initialize checking account properties.
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
        
    }
    // List any methods specific to the checking account
    
    private void setDebitCard() {
        Random rand = new Random();
        debitCardNumber = (long) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }
    
    
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Checking");
        super.showInfo();
        System.out.println(
                "Your Checking Account Features" + 
                "\n  Debit Card Number: " + debitCardNumber + 
                "\n  Debit Card Pin: " + debitCardPin
                );
    }
   
}
