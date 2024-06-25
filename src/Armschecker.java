import java.util.Scanner;
public class Armschecker {
    public static void main(String[] args) {

      for(int i=2;i<=400;i++){
          if(ArmCh(i)){
              System.out.println(i);
          }

      }
    }
    static boolean ArmCh(int n) {
        int sum = 0;
        int original = n;
        while (n > 0) {

            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;

        }
        if (sum == original) {
            return true;
        }
        return false;

    }
}



