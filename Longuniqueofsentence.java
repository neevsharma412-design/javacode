import java.util.*;

class Solution {

    public static void main(String[] args) {

        String sentence = "java is powerful and java is fast";

        String[] words = sentence.split(" ");

        Set<String> uniqueWords = new LinkedHashSet<>();

        for(String word : words) {
            uniqueWords.add(word);
        }

        for(String word : uniqueWords) {

            if(word.length() > 4) {
                System.out.println(word);
            }
        }
    }
}