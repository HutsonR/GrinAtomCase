package Tests;
import static org.junit.Assert.*;
import org.junit.Test;
import Solutions.Palindrome;

public class PalindromeTest {

    @Test
    public void testIsPalindromeWithValidPalindrome() {
        assertTrue(Palindrome.isPalindrome("racecar"));
    }

    @Test
    public void testIsPalindromeWithValidNonPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    public void testIsPalindromeWithSingleCharacter() {
        assertTrue(Palindrome.isPalindrome("a"));
    }

    @Test
    public void testIsPalindromeWithWhitespace() {
        assertTrue(Palindrome.isPalindrome("  "));
    }

    @Test
    public void testIsPalindromeWithMixedCharacters() {
        assertTrue(Palindrome.isPalindrome("A man, a plan, a canal, Panama"));
    }
}

