// All repeating words in paragraph
package Strings;

import java.util.HashMap;

public class RepeatingWords {
    public static void printRepeatingWords(String paragraph) {
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Split the paragraph into words using spaces and punctuation
        String[] words = paragraph.toLowerCase().split(" ");

        // Count the occurrences of each word
        for (String s : words) {
            if (!s.isEmpty()) {
                // Remove punctuation from the word
                s = s.replaceAll("[^a-z]", ""); // Keep only letters
                wordCount.put(s, wordCount.getOrDefault(s, 0) + 1);
            }
        }

        // Print the repeating words
        System.out.println("Repeating words:");
        for (String word : wordCount.keySet()) {
            if (wordCount.get(word) > 1) {
                System.out.println(word + ": " + wordCount.get(word));
            }
        }
    }

    public static void main(String[] args) {
        String paragraph = "This is a test. this this this a This test is only a test.";
        printRepeatingWords(paragraph);
    }
}
