import java.util.Scanner;
public class Questionone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int []arr = new int[n];

        for (int i = 0; i <n ; i++) {
            arr[i]= in.nextInt();
        }
            FindMax(arr,n);

    }
    static void FindMax(int arr[], int n){
        int max=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
