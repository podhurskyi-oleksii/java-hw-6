import java.util.Arrays;
import java.util.StringJoiner;

public class DoubleSpaceCleaner {
    public String clean(String phrase) {
        StringJoiner str = new StringJoiner(" ");
        for (String i : phrase.strip().split(" ")) {
            if(!i.isBlank())
            str.add(i);
        }
        return str.toString();
    }
}

class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World!"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          !"));
    }
}