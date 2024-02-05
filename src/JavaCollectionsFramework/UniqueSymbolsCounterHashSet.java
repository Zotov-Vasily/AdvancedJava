package JavaCollectionsFramework;

import java.util.HashSet;

public class UniqueSymbolsCounterHashSet {
    public static void main(String[] args) {
        String inputString  = "Пример Java HashSet";
        int uniqueCharactersCount = countUniqueCharacters(inputString);
        System.out.println("Количество уникальных символов: " + uniqueCharactersCount);
    }
    public static int countUniqueCharacters(String input) {
        char[] characters = input.toCharArray();
        HashSet<Character> uniqueCharacters = new HashSet<>();

        for (char character: characters) {
            char lowercaseChar = Character.toLowerCase(character);
            uniqueCharacters.add(lowercaseChar);
        }
        return uniqueCharacters.size();
    }
}
