import java.util.HashMap;

public class LongestPalindromicSubstring {
    String longestPalindrome(String s) {
        String result;
//        get each character in the string
        HashMap<Character, Integer> map = new HashMap<>();

        int start = 0, ends = 0;

        for (int i = 1; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.containsKey(c)) {
                int j = map.get(c);
                if (isPalindrome(s, i, j)) {
                    if (i - j > ends - start) {
                        start = j;
                        ends = i;
                    }
                }
            }
            map.put(c, i);
        }
        return s.substring(start, ends + 1);
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j++;
        }
        return true;
    }
}
