public class BigOrSmall {

    public String calculate(String text) {
        char[] str = text.toCharArray();
        int countSmall = 0;
        int countBig = 0;
        for (char c : str) {
            if (Character.isLowerCase(c)) {
                countSmall++;
            } else countBig++;
        }
        if (countBig > countSmall) {
            return "Big";
        } else if(countBig < countSmall) {
            return "Small";
        }
        return "Same";
    }
}

class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}