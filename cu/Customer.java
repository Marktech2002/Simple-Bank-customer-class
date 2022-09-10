package cu;

public class Customer {
    String name;
    int accountNumber;
    double balance;

    public Customer(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void checkbalance() {
        System.out.println("The account balance of " + this.name + " is " + this.balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("You have deposited " + amount);
        } else {
            System.out.println("You are mad boss");
        }
    }
   
    public void Withdraw(double withdrawAmount) {
        if (withdrawAmount > balance) {
            System.out.println("sapa boss");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("You withdraw" + withdrawAmount);
        }
    }

    public void openAccount(String name) {
        System.out.println(this.name + "your account have been created !welcome");
    }

}