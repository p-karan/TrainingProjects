import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            if((i%2)==0){
                sum += (i * i);
            }

        }
        System.out.println("Number was: "+num);
        System.out.println("Sum of squares of even number is: "+sum);
    }
}
