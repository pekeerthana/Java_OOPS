public class Bank {

    public static void main(String[] args) {

        BankAccount keeAccount = new BankAccount();
        // keeAccount.setAccountNumber(122345);
        // keeAccount.setCustName("Keerthana");
        // keeAccount.setEmail("kee@gmail.com");
        // keeAccount.setPhoneNo(123999903);
        // keeAccount.setBalance(200);
        keeAccount.getAccountNumber();
        keeAccount.Withdraw(250);
        keeAccount.BankDetails();
        keeAccount.CheckBalance();

        BankAccount thaAccount = new BankAccount("Tharun","tharun@gmail.com");
        thaAccount.getAccountNumber();
        thaAccount.getCustName();
        thaAccount.Withdraw(250);
        thaAccount.BankDetails();
        thaAccount.CheckBalance();



        
    }
    
}
