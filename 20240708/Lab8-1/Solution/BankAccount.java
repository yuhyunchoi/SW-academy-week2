import java.math.*;
import java.util.Scanner;

public class BankAccount {
    private long accountNumber;
    private String ownerName;
    private BigDecimal balance;

    private static long nextAccountNumber;

    private static long nextNumber() {
        return nextAccountNumber++;
    }

    public void setData(String ownerName, BigDecimal balance) {
        this.accountNumber = nextNumber();
        this.ownerName = ownerName;
        this.balance = balance;
    }
        
    public long getNumber() {
        return this.accountNumber;
    }
        
    public String getOwnerName() {
        return this.ownerName;
    }
        
    public BigDecimal getBalance() {
        return this.balance;
    } 
    
    public BigDecimal deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
        return this.balance;
    }

    public boolean withDraw(BigDecimal amount) {
        if (amount.compareTo(this.balance) == 1 || amount.compareTo(this.balance) == 0) {
            return false;
        }
        else {
            balance = balance.subtract(amount);
            return true;
        }
    }

    public void transferFrom(BankAccount accFrom, BigDecimal amount) {
        if (accFrom.withDraw(amount)) {
            this.deposit(amount);
        }
    }
}

class CreateAccount {
    public static BankAccount createNewBankAccount(String ownerName, BigDecimal balance) {
        BankAccount newAccount = new BankAccount();
        newAccount.setData(ownerName, balance);

        return newAccount;
    }

    public static void TestDeposit(BankAccount account) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        BigDecimal amount = new BigDecimal(scanner.next());
        account.deposit(amount);
    }

    public static void TestWithDraw(BankAccount account) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        BigDecimal amount = new BigDecimal(scanner.next());
        if(!account.withDraw(amount)) {
            System.out.println("Insufficient funds!");
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = CreateAccount.createNewBankAccount("Vesper Lind", new BigDecimal("0.0"));
        printBankAccount(bankAccount);
        TestDeposit(bankAccount);
        printBankAccount(bankAccount);
        TestWithDraw(bankAccount);
        printBankAccount(bankAccount);

        BankAccount bankAccount2 = CreateAccount.createNewBankAccount("Celine ", new BigDecimal("0.0"));      
        printBankAccount(bankAccount2);
        TestDeposit(bankAccount2);
        printBankAccount(bankAccount2);
        TestWithDraw(bankAccount2);
        printBankAccount(bankAccount2);
    }

    public static void printBankAccount(BankAccount account) {
        System.out.println("Account Number: " + account.getNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance: " + account.getBalance() + "\n");
    }
}