public class AvgWordLength {
     public double count(String text){
         int sum = 0;
         int count = 0;
         for (String t : text.split(" ")) {
             count++;
             sum += t.length();
         }
         return (double) sum / count;
     }
}

class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}