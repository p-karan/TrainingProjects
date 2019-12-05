import java.util.Scanner;

public class SumAvg {
    public static void main(String[] args) {
        int a,b,c;
        float sum, avg;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sum = (a+b+c);
        avg = sum/3;
        System.out.println("Sum is: "+sum);
        System.out.println("Avg is: "+avg);
    }
}
