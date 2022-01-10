import java.util.StringJoiner;

public class WordDeleter {

    public String remove(String phrase, String[] words) {
        String[] str = phrase.split(" ");
        StringJoiner joiner = new StringJoiner(" ");
        for (String s : str) {
            if (!contains(s, words)) {
                joiner.add(s);
            }
        }
        return joiner.toString();
    }

    public boolean contains(String s, String[] words) {
        for (String word : words) {
            if (s.equals(word)) {
                return true;
            }
        }
        return false;
    }
}

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[]{"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[]{"is"}));
    }
}