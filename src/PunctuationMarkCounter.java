public class PunctuationMarkCounter {

    public int count(String phrase) {
        int count = 0;
        char[] letters = phrase.toCharArray();
        for (char i : letters){
            if (i == '.' || i == ',' || i == '!' || i == ':' || i == ';' ) {
                count++;
            }
        }
        return count;
    }
}

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}
