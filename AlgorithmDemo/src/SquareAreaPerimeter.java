import java.util.Scanner;

public class SquareAreaPerimeter {
    public static void main(String[] args) {
        int len, area, perimeter;
        Scanner sc = new Scanner(System.in);
        len=sc.nextInt();
        area = (len * len);
        perimeter = 4 * len;
        System.out.println("Area of Square: "+area);
        System.out.println("Perimeter of Square: "+perimeter);
    }
}
