package learn_java.code_wars;

public class DuplicateEncoders {
    public static String encode(String word) {
        word = word.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (word.indexOf(c) == word.lastIndexOf(c)) {
                result.append("(");
            } else {
                result.append(")");
            }
        }
        return result.toString();
    }
}
