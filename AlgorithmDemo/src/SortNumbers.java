public class SortNumbers {
    public static void main(String[] args) {
        int num[]={6,3,4,1,2,5};
        int x = num[0];
        int temp[]=new int[num.length];
        for(int i=1;i<num.length;i++){
            while(x>num[i]){
                temp[i]=num[i];
                break;
            }
        }
        for (int i=0;i<temp.length;i++) {
            System.out.println(temp[i]);
        }
    }
}
