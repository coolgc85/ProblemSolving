package coolgc.io.lambda.coolgc.io.lamda;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRegexTest {

    static MyRegex myRegex;

    @BeforeAll
   static void setUp() {
       myRegex = new MyRegex();
    }

    @Test
    void checkCorrectStandardIp() {
       // String ip = "255.255.255.600";
         String ip = "121.234.12.12";
        var result = ip.matches(myRegex.getPattern());
        assertTrue(result);
    }

    @Test
    void checkCorrectStandardPrivateIp() {
        String ip = "23.45.12.56";
        var result = ip.matches(myRegex.getPattern());
        assertTrue(result);
    }


    @Test
    void checkWithTrailingZeros() {
        // String ip = "255.255.255.600";
        String ip = "000.12.12.034";
        var result = ip.matches(myRegex.getPattern());
        assertTrue(result);
    }

    @Test
    void checkOutOfRange() {
        String ip = "255.255.255.526";
        var result = ip.matches(myRegex.getPattern());
        assertFalse(result);
    }

    @Test
    void checkWithLetters() {
        String ip = "I.Am.not.an.ip";
        var result = ip.matches(myRegex.getPattern());
        assertFalse(result);
    }

    @Test
    void checkWithExtraOctet() {
        String ip = "255.255.255.255.255";
        var result = ip.matches(myRegex.getPattern());
        assertFalse(result);
    }

    @Test
    void checkWithExtraEmptyOctetAtEnd() {
        String ip = "255.255.255.255.";
        var result = ip.matches(myRegex.getPattern());
        assertFalse(result);
    }

    @Test
    void checkWithExtraEmptyOctetAtBeginning() {
        String ip = ".255.255.255.255";
        var result = ip.matches(myRegex.getPattern());
        assertFalse(result);
    }

    @Test
    void checkWithLettersAndNumbers() {
        String ip = "VUUT.12.12";
        var result = ip.matches(myRegex.getPattern());
        assertFalse(result);
    }


    @Test
    void checkOnlyDots() {
        String ip = ".....";
        var result = ip.matches(myRegex.getPattern());
        assertFalse(result);
    }

    @Test
    void validateOnlyZeros() {
        String ip = "0.0.0.0";
        var result = ip.matches(myRegex.getPattern());
        assertTrue(result);
    }

    @Test
    void validateLongSegmentsWithZeroOctets() {
        String ip = "00000.000000.0000000.00001";
        var result = ip.matches(myRegex.getPattern());
        assertFalse(result);
    }

    @Test
    void validateLongSegmentsWithTrailingZeros() {
        String ip = "0023.0012.0012.0034";
        var result = ip.matches(myRegex.getPattern());
        assertFalse(result);
    }


}