import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {
    LongestPalindromicSubstring check =new LongestPalindromicSubstring();
    @Test
    void longestPalindrome() {
        assertEquals("aba", check.longestPalindrome("babad"));
    }
}