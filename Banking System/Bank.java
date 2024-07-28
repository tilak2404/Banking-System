import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void createAccount(String accountNumber, String accountHolder, double balance) {
        accounts.add(new Account(accountNumber, accountHolder, balance));
    }

    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void depositMoney(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdrawMoney(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            if (account.withdraw(amount)) {
                System.out.println("Amount withdrawn successfully.");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    public void checkBalance(String accountNumber) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.println("Account balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    public void viewAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (Account account : accounts) {
                System.out.println(account);
            }
        }
    }
}
