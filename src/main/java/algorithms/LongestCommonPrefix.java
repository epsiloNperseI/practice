package algorithms;

import java.util.Objects;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "There is no common prefix among the input strings.";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) return "";
            }
        }

        return Objects.equals(prefix, "") ? "There is no common prefix among the input strings." : prefix;
    }

}
