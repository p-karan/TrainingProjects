import java.util.Scanner;

public class CalculateBMI {
    static float calBMI(int kg, float mtr){
        float BMI = kg/(mtr * mtr);
        return BMI;
    }

    public static void main(String[] args) {
        int kg;
        float mtr;
        Scanner sc=new Scanner(System.in);
        kg=sc.nextInt();
        mtr=sc.nextFloat();
        float BMIcal = calBMI(kg, mtr);

        if (BMIcal >= 30)
            System.out.println("Obese");
        else if(BMIcal >= 25)
            System.out.println("Overweight");
        else if(BMIcal >= 18)
            System.out.println("Normal");
        else if(BMIcal < 18)
            System.out.println("Underweight");
    }
}
