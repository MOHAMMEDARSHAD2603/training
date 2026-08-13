class BankAccount {
    static String bankName = "Mariamman Indian Bank";

    private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, String mobileNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        }
    }

    public void displayAccountDetails() {
        System.out.println("====================================");
        System.out.println("       " + bankName.toUpperCase());
        System.out.println("====================================");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : Rs." + balance);
        System.out.println();
    }
}

public class problem {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1001, "Arun", "9876543210", "Savings", 25000);
        BankAccount account2 = new BankAccount(1002, "Kumar", "9876501234", "Current", 50000);

        account1.displayAccountDetails();
        account1.deposit(5000);
        System.out.println("Updated Balance: Rs." + account1.getBalance());
        account1.withdraw(3000);
        System.out.println("Updated Balance: Rs." + account1.getBalance());
        account1.setMobileNumber("9999999999");
        System.out.println("Updated Mobile Number: " + account1.getMobileNumber());
        account1.deposit(-1000);
        account1.withdraw(-500);
        account1.withdraw(100000);

        account2.displayAccountDetails();
        account2.deposit(10000);
        account2.withdraw(5000);
        account2.displayAccountDetails();
    }
}
