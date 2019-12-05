public class ReverseArray {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        int temp[]=new int[num.length];

        for(int i=num.length-1,j=0;i>=0;j++,i--) {
            temp[j] = num[i];
        }
        for(int x=0;x<num.length;x++){
            System.out.println(temp[x]);
        }
    }
}
