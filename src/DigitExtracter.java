import java.util.Arrays;

public class DigitExtracter {
    public int[] extract(String text) {
        char[] str = text.toCharArray();
        int index = 0;
        int count = 0;
        for (char c : str) {
            if (Character.isDigit(c)){
                count++;
            }
        }
        int[] digits = new int[count];
        for (char c : str) {
            if (Character.isDigit(c)) {
                digits[index++] =  Character.digit(c, 10);
            }
        }
        return digits;
    }
}

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}