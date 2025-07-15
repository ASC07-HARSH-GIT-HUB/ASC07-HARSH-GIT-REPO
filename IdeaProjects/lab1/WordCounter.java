package lab1;

public class WordCounter {
    public static int countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        String[] cntr = new String[words.length];
        int count = 0;
        for (String word : words) {
            if (!isInt(word)) {
                count++;
            }
        }
        return count;
    }
    public static boolean isInt(String w) {
        try {
            Integer.parseInt(w);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String input = "Sum of 12 and 20 is 32";
        System.out.println("Word Count: " + countWords(input));  // Output: 7
    }
}