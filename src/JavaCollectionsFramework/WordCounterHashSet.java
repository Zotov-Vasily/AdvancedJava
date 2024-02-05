package JavaCollectionsFramework;

import java.util.HashSet;

public class WordCounterHashSet {
    public static void main(String[] args) {
        String text = "Java HashSet — мощный инструмент для обработки уникальных элементов.";
        int uniqueWordCount = countUniqueWords(text);
        System.out.println("Количество уникальных слов: " + uniqueWordCount);
    }
    public static int countUniqueWords(String text) {
        String[] words = text.split("\\W+");

        HashSet<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            uniqueWords.add(lowercaseWord);
        }
        return uniqueWords.size();
    }
}
