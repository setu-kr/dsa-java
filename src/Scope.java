import java.util.Scanner;
public class Scope {
    public static void main(String[] args) {
        int a=5;
        System.out.println(a);
        random();
        {
            int c=5;
            System.out.println(c);
        }
    }
   static void random(){
        int b=66;
       System.out.println(b);
   }
}
