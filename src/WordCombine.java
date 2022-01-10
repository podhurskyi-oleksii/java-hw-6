import java.util.Locale;

public class WordCombine {

    public boolean canCombine(String sourceWord, String targetWord) {
        char[] sourceLetters = sourceWord.toLowerCase(Locale.ROOT).toCharArray();
        char[] targetLetters = targetWord.toLowerCase(Locale.ROOT).toCharArray();
        int check = 0;

        for (char targetLetter : targetLetters) {
            if (comp(sourceLetters, targetLetter))
            {
                check++;
            }
        }
        return check == targetWord.length();
    }

    public boolean comp(char[] sourceLetters, char targetLetter) {
        for (char sourceLetter : sourceLetters) {
            if(sourceLetter == targetLetter) {
                return true;
            }
        }
        return false;
    }
}

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}