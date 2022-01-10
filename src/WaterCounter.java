public class WaterCounter {

    public double count(String text) {
        char[] str = text.toCharArray();
        int sum = 0;
        for (char c : str) {
            if (Character.isSpaceChar(c)) {
                sum++;
            }
        }
        return (double) sum / str.length;
    }
}

class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}