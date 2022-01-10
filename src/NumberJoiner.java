public class NumberJoiner {
    public String join(int[] numbers) {
        StringBuilder builder = new StringBuilder();
        for (int num : numbers) {
            builder.append(num);
        }
        return builder.toString();
    }
}

class NumberJoinerTest {
    public static void main(String[] args) {
        //102030
        System.out.println(new NumberJoiner().join(new int[] {10, 20, 30}));
    }
}