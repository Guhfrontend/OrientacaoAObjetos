package Fixacao.Example1;

public class Account {

    private int number;
    private String holder;
    private double balance;

    @Override
    public String toString() {
        System.out.println();
        System.out.println("Accout data: ");
        System.out.printf("Account number: %d, Holder: %s, balance: $ %.2f %n", number, holder, balance);
        return null;
    }

    public Account(){

    }
    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;
    }
    public Account(int number, String holder, double initialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount +5;
    }
}
