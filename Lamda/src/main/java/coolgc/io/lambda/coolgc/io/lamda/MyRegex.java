package coolgc.io.lambda.coolgc.io.lamda;

public class MyRegex {
    /**
     * IP address is a string in the form "A.B.C.D",
     * where the value of A, B, C, and D may range from 0 to 255.
     * Leading zeros are allowed.
     * The length of A, B, C, or D can't be greater than 3.
     *
     * 000.12.12.034
     * 121.234.12.12
     * 23.45.12.56
     */

    public String pattern;

    public MyRegex() {
        this.pattern = "^(([0-2]*[0-9][0-9]+)\\.([0-2]*[0-9][0-9]+)\\.([0-2]*[0-9][0-9]+)\\.([0-2]*[0-9][0-9]))$";
    }

    public String getPattern() {
        return pattern;
    }
}
