public class Qtwo {
    public static String reverseString(String input) {
        String result = "";

        for (int i = input.length() - 1; i >= 0; i--) {

            result = result+input.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {

        String original = "Hello, World!";
        String reversed = reverseString(original);


        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}