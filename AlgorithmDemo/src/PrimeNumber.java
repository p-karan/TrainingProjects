import java.util.Scanner;

public class PrimeNumber {

    static void isPrime(int num){
        boolean flag=false;
        for(int i=2;i<num;i++){
            if((num%i)==0) {
                flag=true;
                break;
            }
        }
        if(flag)
            System.out.println(num+ " is not a Prime number.");
        else
            System.out.println(num+ " is a Prime number");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        isPrime(num);
    }
}
