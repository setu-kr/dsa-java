import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       String A = in.nextLine();


        switch (A) {
            case "Bbw" -> System.out.println("King of fruits");
            case "hi" -> System.out.println("A sweet red fruit");
            case "ui" -> {
                System.out.println("Round fruit");


                System.out.println("please enter a valid fr");
            }
            default -> System.out.println("please enter a valid fr");
        }
}
}