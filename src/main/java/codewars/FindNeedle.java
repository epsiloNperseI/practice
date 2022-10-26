package codewars;

public class FindNeedle {
    public static String findNeedle(Object[] haystack) {
        int position = 0;
        for (int i = 0; i < haystack.length; i++) {
            String parsedObj = String.valueOf(haystack[i]);
            if (parsedObj.equals("needle")) {
                position = i;
            }
        }
        return "found the needle at position " + position;
    }
}
