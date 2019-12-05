public class AboveAvg {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2};
        float sum=0,avg;
        for (int i=0;i<num.length;i++)
        {
           sum += num[i];
        }
        avg = sum/num.length;
        System.out.println("Sum is: "+sum);
        System.out.println("Avg is: "+avg);

        for (int i=0;i<num.length;i++){
           if(num[i]>avg){
               System.out.println(num[i]);
           }

        }

    }
}
