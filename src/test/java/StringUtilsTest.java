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