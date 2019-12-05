import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(int i=1;i<=10;i++){
            int x;
            x=a * i;
            System.out.println(a+" x "+i+" = "+x);
        }

    }
}
