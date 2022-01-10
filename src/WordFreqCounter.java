public class WordFreqCounter {

    public float countFreq(String phrase, String word) {
        String[] words = phrase.split(" ");
        int count = 0;
        for (String i : words) {
            if (i.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return (float) count / words.length;
    }
}

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}