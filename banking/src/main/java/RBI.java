public class RBI implements Operations{
    private int minBal;
    private int savingPercent;
    private int fixedDeposit;
    private int balance;
    private int yrs;
    private int fdAmount;


    public void deposit(int amount, int balance) {
         balance = balance+amount;
        System.out.println("Updated balance is: "+balance);
    }

    public void withdraw(int amount, int minBal, int bal) {

        int tempBal=(bal-amount);
        if(tempBal>=minBal) {
            System.out.println("Withdraw successful!");
            bal = tempBal;
            System.out.println("updated balance is: " + bal);
        }else System.out.println("Insufficient balance for withdrawal!");
    }

    public void openFd(int amount, int years) {
        if(amount>=fdAmount && years>=yrs){
            System.out.println("Opening an FD Account successful!");
        }else{
            System.out.println("Sorry, Minimum criteria for FD opening not met.");
        }

    }

}
