import java.util.Arrays;
import java.util.Scanner;
public class Arrin {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n= in.nextInt();
       int []arr= new int[n];
       for(int i=0; i<arr.length; i++){
           arr[i]=in.nextInt();
       }
        System.out.println(Arrays.toString(arr));
       change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int []arr){
        arr[0]=99;
    }

}
