import java.util.Arrays;
import java.util.HashSet;

public class WordsChecker {
    private HashSet<String> words;

    public WordsChecker(String text) {
        String[] strWords = text.toLowerCase().split("\\P{IsAlphabetic}+");
        this.words = new HashSet<>(Arrays.asList(strWords));
    }

    public boolean hasWord(String searchWord) {
        return words.contains(searchWord.toLowerCase());
    }
}
