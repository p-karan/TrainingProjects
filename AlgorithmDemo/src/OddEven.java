import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int a, result;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        result = (a%2);
        if(result == 0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}
