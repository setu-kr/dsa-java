import java.util.Arrays;

public class maxelement {
    public static void main(String[] args) {
        int []arr1 = {11,2,23,409,5,6,7,82,9,10};

       swap(arr1,0,9);
        System.out.println(Arrays.toString(arr1));

    }

//    static void swap(int []arr, int start, int end){
//        for(int i=start; i<end; i++){
//            int temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]= temp;
//            start++;
//            end--;
//        }

        static void swap(int []arr, int start, int end){
           while(start<end){
               int temp=arr[start];
            arr[start]=arr[end];
            arr[end]= temp;
            start++;
            end--;
            }
    }
}
