public class SumAvgArray {
    public static void main(String[] args) {
        float sum=0, avg;
        int num[] = new int[5];
        for(int i=0;i<num.length;i++){
            num[i] = 80 + i;
        }
        for(int i=0;i<num.length;i++){
            sum += num[i];
        }

            avg = sum/num.length;
        System.out.println("Sum is: "+sum);
        System.out.println("Avg is: "+avg);

    }
}
