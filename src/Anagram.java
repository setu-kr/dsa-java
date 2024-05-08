import java.util.Arrays;

public class Anagram {


    public static boolean areAnagrams(String str1, String str2) {

        if (str1.length() != str2.length())
            return false;


        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();


        Arrays.sort(charArray1);
        Arrays.sort(charArray2);


        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = args[0];
        String str2 = args[1];

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " " + str2 + " are not anagrams.");
        }
    }
}


