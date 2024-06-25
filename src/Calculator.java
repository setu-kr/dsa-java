import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double result = scanner.nextDouble();

        while (true) {
            System.out.println("Enter the operation (+, -, *, /) or 'q' to quit:");
            String operator = scanner.next();

            if (operator.equals("q")) {
                System.out.println("Exiting calculator...");
                break;
            }

            System.out.println("Enter the second number:");
            double num = scanner.nextDouble();

            // double result = 0;
            if (operator.equals("+")) {
                result = result + num;
            } else if (operator.equals("-")) {
                result = result - num;
            } else if (operator.equals("*")) {
                result = result * num;
            } else if (operator.equals("/")) {
                if (num != 0) {
                    result = result / num;
                } else {
                    System.out.println("Error: Division by zero!");
                    continue;
                }
            } else {
                System.out.println("Invalid operator!");
                continue;
            }

            System.out.println("Result: " + result);
        }
        scanner.close();
    }

    // public void operation() {

    // }
}