package codewars;

public class SpinWords {
    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= words.length - 1; i++) {
            if (words[i].length() >= 5) {
                result.append(new StringBuilder(words[i]).reverse());
            } else {
                result.append(words[i]);
            }

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
