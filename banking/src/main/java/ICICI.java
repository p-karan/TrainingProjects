import java.util.Scanner;

public class ICICI extends RBI{
    private int minBal;
    private int balance;
    private int savingPercent;
    private int fixedDeposit;

    @Override
    public void deposit(int amount,int balance) {
        super.deposit(amount,balance);
    }

    @Override
    public void withdraw(int amount, int minBal, int bal) {
        super.withdraw(amount, minBal, bal);
    }

    @Override
    public void openFd(int amount, int years) {
        super.openFd(amount, years);
    }

    public int getMinBal() {
        return minBal;
    }

    public void setMinBal(int minBal) {
        this.minBal = minBal;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getSavingPercent() {
        return savingPercent;
    }

    public void setSavingPercent(int savingPercent) {
        this.savingPercent = savingPercent;
    }

    public int getFixedDeposit() {
        return fixedDeposit;
    }

    public void setFixedDeposit(int fixedDeposit) {
        this.fixedDeposit = fixedDeposit;
    }
}
