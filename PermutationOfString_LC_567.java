import java.util.Arrays;

public class PermutationOfString_LC_567 {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length())
            return false;

        int[] freq = new int[26];
        for (char c : s1.toCharArray())
            freq[c - 'a']++;

        int[] window = new int[26];
        for (int i = 0; i < s2.length(); i++) {
            window[s2.charAt(i) - 'a']++;

            if (i >= s1.length())
                window[s2.charAt(i - s1.length()) - 'a']--;

            if (Arrays.equals(freq, window))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        PermutationOfString_LC_567 sol = new PermutationOfString_LC_567();

        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean result = sol.checkInclusion(s1, s2);
        System.out.println(result);

        String s3 = "abc";
        String s4 = "ccccbbbbaaaa";
        boolean result2 = sol.checkInclusion(s3, s4);
        System.out.println(result2);
    }
}
