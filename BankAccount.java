public class BankAccount {

    private int accountNumber;
    private int balance;
    private String custName;
    private String email;
    private int phoneNo;

    // construtors

    public BankAccount(){
        this(123555, 0, "Default Name", "Default", 998888888);
    }

    public BankAccount(int number, int balance, String custName, String email, int phoneNo){
        System.out.println("Parameterized constructor");
        accountNumber = number;
        this.balance = balance;
        this.custName = custName;
        this.email = email;
        this.phoneNo = phoneNo;

    }

    public BankAccount(String custName,String email){
        this(123555, 0, custName,email,9999199);
        System.out.println("Only 2 parameter constructor");
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void Withdraw(int amount){
        if(amount > balance){
            System.out.println("Insufficient Funds");
        }
        else{
            balance =balance -amount;
        }
        
    }

    public void Deposit(int amount){
        balance = balance+ amount;
    }

    public void CheckBalance(){
        System.out.println("Available balance: "+ balance);
    }

    public void BankDetails(){
        System.out.println("Customer Name: "+ custName);
        System.out.println("Email id: "+ email);
        System.out.println("Phone no: "+ phoneNo);
        System.out.println("Account Number: "+ accountNumber);
    }

    
}
