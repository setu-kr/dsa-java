import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {


            for(int i =0;i<=1000;i++) {
                if (armstong(i)) {
                    System.out.println(i);
                }
            }
    }
    static boolean armstong(int n){
        int original = n;
        int sum =0;

        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum+ rem*rem*rem;

        }
        if(sum==original){
            return true;
        }
        return false;
    }

}
