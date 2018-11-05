package bankaccountapp;

public class BankAccountApp {

    public static void main(String[] args) {
        
        Checking chkacc1 = new Checking("Jessica Dai", "129394332", 1500);
        Savings savacc1 = new Savings("Tom Smith", "322223333", 2000);
        // Read a CSV file then create new accounts based on that data
        
        savacc1.showInfo();
        System.out.println("***********");
        chkacc1.showInfo();
    }

}
