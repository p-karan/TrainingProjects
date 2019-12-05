public class Fibonacci {
    public static void main(String[] args) {
        int sum[]=new int[15];

        sum[0]=1;
        sum[1]=1;
        int y=0;


        for(int i=2;i<15;i++){
            if(sum[i-1]<100)
            {
                sum[i]=sum[i-1] + sum[i-2];

            }else{
                break;

            }
            y = i;
        }

        for(int x=0;x<y;x++)
            System.out.print(sum[x]+" ");

    }
}