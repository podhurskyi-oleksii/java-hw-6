public class MathDetector {

    public boolean isMath(String text) {
        char[] str = text.toCharArray();
        int[] check = {0, 0, 0};
        for (char c : str) {
            if (c == '=') {
                check[0]++;
            }
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                check[1]++;
            }
            if (c >= '0' && c <= '9') {
                check[2]++;
            }
        }
        if (check[0] > 0 && check[1] > 0 && check[2] > 1) {
            return true;
        }
        return false;
    }
}

class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1/0=q"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}