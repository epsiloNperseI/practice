package leetcode;

public class KMP {

    public static void main(String[] args) {
        KMP kmp = new KMP();

        System.out.println(kmp.strStr("ABABDABACDABABCABAB", "ABABCABAB"));
    }

    public int strStr(String haystack, String needle) {

        if (needle.isEmpty()) return 0;

        int[] lps = buildLPS(needle);

        int i = 0, j = 0;

        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if (j == needle.length()) {
                    return i - j;
                }
            } else if (j > 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }

        return -1;

    }

    private int[] buildLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0;
        int i = 1;
        lps[0] = 0;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = len;
                    i++;
                }
            }
        }
        return lps;
    }

}
