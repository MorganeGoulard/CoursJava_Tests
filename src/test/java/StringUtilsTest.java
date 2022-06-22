import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    @DisplayName("should concatenate two strings")
    void concat(){
        assertEquals("papa",StringUtils.concat("pa","pa"));
    }

    @Test
    @DisplayName("should return true with kayak")
    void isPalindromeKayak(){
        boolean result=StringUtils.isPalindrom("kayak");
        assertTrue(result);
    }

    @Test
    @DisplayName("should return false with bonjour")
    void isPalindromeBonjour(){
        assertFalse(StringUtils.isPalindrom("bonjour"));
    }

    @Test
    @DisplayName("should return true with empty string")
    void isPalindromeChaineVide(){
        assertTrue(StringUtils.isPalindrom(""));
    }

    @Test
    @DisplayName("should return true with KAYak")
    void isPalindromeKAYak(){
        assertTrue(StringUtils.isPalindrom("KAYak"));
    }

    @Test
    @DisplayName("should return true with string containing spaces")
    void isPalindromeWithSpace(){
        assertTrue(StringUtils.isPalindrom("Engage le jeu que je le gagne"));
    }

    @Nested
    @DisplayName("Capitalize")

    class Capitalize {

        @Test
        @DisplayName("Should return a upper case at the beggining of each word with all in lower cases")
        void capitalizeWithLowerCase(){
            assertEquals("Je Suis Dans La Joie", StringUtils.capitalize("Je Suis Dans La Joie"));
        }

        @Test
        @DisplayName("Should return a upper case at the beggining of each word with first letter in upper case")
        void capitalizeWithUpperCase(){
            assertEquals("Je Suis Dans La Joie",StringUtils.capitalize("Je Suis Dans La Joie"));
        }

        @Test
        @DisplayName("Should return a upper case at the beggining of each word with all in upper case")
        void capitalizeWithAllUpperCase(){
            assertEquals("Je Suis Dans La Joie", StringUtils.capitalize("JE SUIS DANS LA JOIE"));
        }

        @Test
        @DisplayName("Should return a upper case at the beggining of each word when space is replaced by a special character")
        void capitalizeWithSpecialCharacter(){
            assertEquals("Je Suis Jean-Paul",StringUtils.capitalize("je suis jean-paul"));
        }
    }

    @Nested
    @DisplayName("reverseInt")
    class reverseInt
    {
        @Test
        @DisplayName("should return an inversed int from an int lasting 0")
        void reverseInt()
        {
            assertEquals(89,StringUtils.reverseInt(98));
        }
        @Test
        @DisplayName("should return an inversed int from an int lasting 0")
        void reverseIntZero()
        {
            assertEquals(1,StringUtils.reverseInt(10));
            assertEquals(21,StringUtils.reverseInt(120));
            assertEquals(0,StringUtils.reverseInt(0));
        }
        @Test
        @DisplayName("should return an inversed int from a negative int lasting 0")
        void reverseIntNeg()
        {
            assertEquals(-1,StringUtils.reverseInt(-10));
            assertEquals(-98,StringUtils.reverseInt(-89));
            assertEquals(-21,StringUtils.reverseInt(-120));
        }
    }

    @Nested
    @DisplayName("Ispalindrome")


    class Palindrome() {

        @Test
        @DisplayName("Should return true with kayak")
        void isPlaindromeKayak() {
            boolean result = StringUtils.isPalindrom("kayak");
            assertTrue(result);
        }

        @Test
        @DisplayName("Is plaindrom Bonjour")
        void isPlaindromeBonjour() {
            boolean result = StringUtils.isPalindrom("bonjour");
            assertFalse(result);
        }

        @Test
        @DisplayName("Should return true with empty String")
        void isPlaindromeChaineVide() {
            boolean result = StringUtils.isPalindrom("");
            assertTrue(result);
        }

        @Test
        @DisplayName("Should return true with KAYak")
        void isPlaindromeKAYak() {

            boolean result = StringUtils.isPalindrom("KAYak");
            assertTrue(result);

        }

        @Test
        @DisplayName("Should return true with string with string spaces")
        void isPlaindromeWithSpaces() {

            boolean result = StringUtils.isPalindrom("Engage le jeu que je le gagne");
            assertTrue(result);

        }
    }


    @Nested
    @DisplayName("IsAnagram")
    class IsAnagram
    {
        @Test
        @DisplayName("Should be false if size different")
        void isLeigthDifferent() {
            assertFalse(StringUtils.isPalindrom("saga"));
        }
        @Test
        @DisplayName("Should be true if is lowercase palindrom")
        void isAnagramLower() {
            assertTrue(StringUtils.isAnagram("gare","rage"));
        }

        @Test
        @DisplayName("Should be true if is uppercase palindrom")
        void isAnagramUpper() {
            assertTrue(StringUtils.isAnagram("GARE","RAGE"));
        }

        @Test
        @DisplayName("Should be true if is capitalize anagram")
        void isAnagramCapitalize() {
            assertTrue(StringUtils.isAnagram("Gare","Rage"));
        }

        @Test
        @DisplayName("Should be true if string empty")
        void isAnagramEmpty() {
            assertTrue(StringUtils.isAnagram("",""));
        }

        @Test
        @DisplayName("Should be true in sentence anagram")
        void isAnagramSentence() {
            assertTrue(StringUtils.isAnagram("Tom Elvis Jedusor","Je suis Voldemort"));
        }
        @Test
        @DisplayName("Should be false is string diffent")
        void IsDifferent(){
            assertFalse(StringUtils.isAnagram("Bonjour","jours bon"));
        }
    }

    @Nested
    @DisplayName("alternate")

    class Alternate {

        @Test
        @DisplayName("should return ")
        void alternateWithLowerCase (){
            char [] chars = new char[]{'a','b','c','d'};
            char [] result = new char[]{'a','B','c','D'};
            assertArrayEquals(result,StringUtils.alternate(chars));

        }
    }
}