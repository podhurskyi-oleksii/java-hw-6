public class DigitText {
    public boolean detect(String phrase) {
        char[] letters = phrase.toCharArray();
        int res = 0;
        for (char letter : letters) {
            if ((letter >= '0' && letter <= '9') || letter == ' ') {
                res++;
            }
        }
        return res == letters.length;
    }
}

class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}