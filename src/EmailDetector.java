public class EmailDetector {

    public boolean isPresent(String text) {
        String[] str = text.split(" ");
        for (String s : str) {
            if (s.contains("@") && s.length() > 5) {
                String[] temp = s.split("@");
                if (temp[0].length() > 1 && temp[1].length() > 1) return true;
            }
        }
        return false;
    }
}

class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}