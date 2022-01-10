public class PalindromeCounter {
    public int count(String phrase) {
        int count = 0;
        for (String i : phrase.split(" ")) {
            String temp = new String(new StringBuilder(i).reverse());
            if (i.equalsIgnoreCase(temp)) {
                count++;
            }
        }
        return count;
    }
}

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}