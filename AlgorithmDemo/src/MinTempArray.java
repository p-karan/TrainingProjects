public class MinTempArray {
    public static void main(String[] args) {
        int temp[]={2,4,6,8,2,8,9,1,12,10};
        int min=temp[0];
        for (int i=1; i< temp.length;i++){
            if (min > temp[i]){
                min=temp[i];

            }
        }
        System.out.println(min);
    }
}
