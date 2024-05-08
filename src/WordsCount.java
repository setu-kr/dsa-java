public class WordsCount {
    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }


        String[] words = sentence.split("\\s+");


        return words.length;
    }

    public static void main(String[] args) {
        String sentence = "I Love Java        Programming";
        countWords(sentence);
        System.out.println(countWords(sentence));
    }
}