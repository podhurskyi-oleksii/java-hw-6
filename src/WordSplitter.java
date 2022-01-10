import java.util.Arrays;

public class WordSplitter {

    public String[] split(String phrase) {
        String[] words = phrase.split(" ");
        int index = 0;
        for (String i : words) {
            if (!i.isBlank()) {
                index++;
            }
        }
        String[] str = new String[index];
        int j = 0;
        for (String i : words) {
            if (!i.isBlank()) {
                str[j] = i.toLowerCase();
                j++;
            }
        }
        return str;
    }
}

class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}