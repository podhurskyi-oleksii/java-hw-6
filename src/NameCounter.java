public class NameCounter {

    public int count(String text) {
        int countName = 0;
        String[] str = text.split(" ");
        for (String s : str) {
            if (s.length() > 1 && Character.isUpperCase(s.charAt(0))) {
                if (isName(s)) countName++;
            }
        }
        return countName;
    }

    public boolean isName(String s) {
        char[] word = s.toCharArray();
        for (int i = 1; i < word.length; i++) {
            if (Character.isUpperCase(word[i])) {
                return false;
            }
        }
        return true;
    }
}

class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}