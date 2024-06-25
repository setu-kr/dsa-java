public class Qthree {

    public static int countVowels(String s) {

        String vowels = "aeiouAEIOU";
        int count = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (vowels.indexOf(c) != -1) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String string = "Hello World";
        System.out.println(countVowels(string));  // Output: 3
    }
}