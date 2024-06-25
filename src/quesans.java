import java.util.Arrays;

public class quesans {
    public static void main(String[] args) {

        int []arr = {1,2,3,4,5,6,7,8,9};
        separator(arr);

    }
    static void separator(int []arr){
        int[] emptyArray = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if (arr[i] % 2==0){
                System.out.println(arr[i]);

            }

        }
        System.out.println("are even nums");

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 !=0){
                System.out.println(arr[i]);

            }
        }
        System.out.println( "are odd nums");

    }
}
