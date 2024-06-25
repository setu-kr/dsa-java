import java.util.Scanner;
public class PrimeChecker {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();

      if (isPrime(n)){
          System.out.println(n+"is a prime num");
      }
      else {
          System.out.println(n+ "is not a prime num");
      }

    }
    static boolean isPrime(int n){
        if (n<2){
            return false;
        }
        for(int i=2; i<= Math.sqrt(n);i++){
            if(n%i==0 ){
                return false;
            }
        }
        return true;
    }

}
