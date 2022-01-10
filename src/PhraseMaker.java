public class PhraseMaker {

    public String join(String[] words) {
        StringBuilder builder = new StringBuilder();
        if (words.length <= 0) {
            return "";
        }
        for (String word : words) {
            if (word.length() <= 3) {
                builder.append(word.toUpperCase());
                builder.append(" ");
            } else {
                builder.append(word.toLowerCase());
                builder.append(" ");
            }
        }
        builder.deleteCharAt(builder.length() - 1);

        return builder.toString();
    }
}

class PhraseMakerTest {
    public static void main(String[] args) {
        String[] words = {"Life", "is", "great", "thing"};

        //life IS great thing
        System.out.println(new PhraseMaker().join(words));
    }
}