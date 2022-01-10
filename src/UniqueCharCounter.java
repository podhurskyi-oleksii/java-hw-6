public class UniqueCharCounter {

    public int count(String phrase) {
        char[] str = phrase.toCharArray();
        char[] unique = new char[phrase.length()];
        int count = 0;
        for (char i : str) {
            if (!contains(unique, i)) {
                unique[count++] = i;
            }
        }
        return count;
    }

    public boolean contains(char[] letters, char i) {
        for (char c : letters) {
            if (c == i) {
                return true;
            }
        }
        return false;
    }
}

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}