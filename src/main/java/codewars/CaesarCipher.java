package codewars;

public class CaesarCipher {

    public static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static String rot_13(String message) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char symbol = message.toCharArray()[i];

            boolean isUpperCase = Character.isUpperCase(symbol);

            if (isUpperCase) {
                symbol = Character.toLowerCase(symbol);
            }


            int indexInAlphabet = new String(alphabet).indexOf(symbol);
            if (indexInAlphabet < 0) {
                result.append(symbol);
                continue;
            }

            int decryptedindex;

            if (indexInAlphabet < 13) {
                decryptedindex = indexInAlphabet + 13;
            } else {
                decryptedindex = Math.abs(indexInAlphabet - 13);
            }

            char charToAppend = isUpperCase ? Character.toUpperCase(alphabet[decryptedindex]) : alphabet[decryptedindex];

            result.append(charToAppend);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        int indexInAlphabet = new String(alphabet).indexOf(" ");
        System.out.println(indexInAlphabet);
    }
}
