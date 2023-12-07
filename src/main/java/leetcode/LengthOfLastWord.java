package leetcode;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        boolean flag = false;

        for (int i = s.length() - 1; i >= 0; i--) {


            if (s.charAt(i) == ' ' && !flag) {
                continue;
            }

            if (s.charAt(i) != ' ') {
                flag = true;
                int j = i;
                while (j >= 0 && s.charAt(j) != ' ') {
                    j--;
                }
                return i - j;
            }
            return 0;
        }

        return 0;
    }
}
