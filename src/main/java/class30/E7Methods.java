package class30;

import class29.BankAccount;

public class E7Methods {
    public static void main(String[] args) { // print methods:

        E7Methods e4Methods=new E7Methods();
        BankAccount bankAccount=new BankAccount(20);
        e4Methods.print(bankAccount);

    }
    // create methods:
    void print(BankAccount bankAccount){ // method to call BankAccount class
     bankAccount.withdraw(10);
    }
}
