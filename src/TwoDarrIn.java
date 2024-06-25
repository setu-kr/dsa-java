import java.util.Arrays;
import java.util.Scanner;
public class TwoDarrIn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 4;

        int[][] arr = new int[3][2];
        for(int rows=0; rows<arr.length; rows++){
            for(int col =0;col<arr[rows].length; col++){
                arr[rows][col]=in.nextInt();
            }
        }

//        for(int rows=0; rows<arr.length; rows++){
//            for(int col =0;col<arr[rows].length; col++) {
//                System.out.print(arr[rows][col] + " ");
//            }
//            System.out.println();
//            }
//        for(int rows=0; rows<arr.length; rows++){
//            System.out.println(Arrays.toString(arr[rows]));
//        }

        for(int []ar :arr){
            System.out.println(Arrays.toString(ar));
        }
    }

}
