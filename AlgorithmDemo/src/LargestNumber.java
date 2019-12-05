import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if((a>b) && (a>c))
            System.out.println("A is the largest");
        else if (b > c)
            System.out.println("B is the largest");
        else System.out.println("C is the largest");
    }
}
