package com.company;

public class Main {

    public static void main(String[] args) {
//        char for use with single character only, occupies 2 bytes or 16 Bits
        char myChar = 'D';
//        unicode character can be worked out from https://unicode-table.com/en/
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);
        boolean myTrueBooleanValue = true;
        boolean myFalseBoolean = false;

        boolean isCustomerOverTwentyOne = true;
    }
}
