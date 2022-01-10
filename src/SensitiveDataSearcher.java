public class SensitiveDataSearcher {

    public boolean isSensitiveDataPresent(String phrase) {
        String[] words = new String[]{"pass", "key", "login", "email"};
        String[] str = phrase.split(" ");
        for (String word : words) {
            if (phrase.toLowerCase().contains(word.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}


class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}