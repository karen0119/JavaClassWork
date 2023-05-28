package class23;

public class BankAccount {  // Encapsulation Example
    private String userName;
    private String password;
    private double accountBalance = 120;

    public BankAccount(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public double getAccountBalance() {  // method to access accountBalance variable
            return accountBalance;
    }
    public void setAccountBalance(double balance){
        accountBalance=balance;
    }

    void setPassword(String password){
        this.password=password;
    }
}

class BankTester{
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("User123","password");
        System.out.println(bankAccount.getAccountBalance());

        bankAccount.setAccountBalance(1000); // to set account balance
        System.out.println(bankAccount.getAccountBalance()); // to print new value

    }
}
