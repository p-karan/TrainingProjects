public class PositiveNumbersArray {
    public static void main(String[] args) {
        int num[]={1,2,3,-1,-2,-3};
        int sum=0;
        for(int i=0; i<num.length;i++){
            if (num[i]>0)
                sum += num[i];
        }
        System.out.println("The sum of positive numbers is: "+sum);
    }
}
