import java.util.Scanner;

public class ConsumerApp {
    public static void main(String[] args) {
        ICICI icici = new ICICI();
        icici.setBalance(6000);
        icici.setMinBal(5000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Indian Banking System");
        System.out.println("Press 1 for ICICI");
        System.out.println("Press 2 for SC");
        System.out.println("Press 3 for AXIS");
        System.out.println("Press 4 for SBI");
        int val = sc.nextInt();


        while(true) {

            System.out.println("Please select the operation:");
            System.out.println("Press 1 for Deposit");
            System.out.println("Press 2 for Withdrawal");
            System.out.println("Press 3 for Opening a FD");
            System.out.println("Press 4 to exit");
            int sel = sc.nextInt();

            int amt;

            switch (val) {
                case 1:
                    if (sel == 1) {
                        System.out.println("Enter amount to deposit");
                        icici.deposit(sc.nextInt(), icici.getBalance());
                    } else if (sel == 2) {
                        System.out.println("Enter amount to withdraw");
                        icici.withdraw(sc.nextInt(), icici.getMinBal(), icici.getBalance());
                    } else if (sel == 3) {
                        System.out.println("Enter amount for FD");
                        amt = sc.nextInt();
                        System.out.println("Enter no of years");
                        icici.openFd(amt, sc.nextInt());
                    } else if (sel==4) {
                        System.exit(0);
                    }
                    else
                        System.out.println("Invalid selection");
                    break;
                default:
                    break;
            }

        }
    }
}
