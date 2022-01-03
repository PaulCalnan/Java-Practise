package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

//        No problem with below as int is default and expression returns an int
        int myTotal = (myMinIntValue / 2);

//        Without using casting (byte) the below expression would result in error as java finds int variable when byte type is required
        byte myNewByteValue = (byte) (myMinByteValue / 2);

//        Without using casting (short) the below expression would result in error as java finds int variable when short type is required
        short myNewShortValue = (short) (myMinShortValue / 2);
        
        byte myNewByteChallenge = (Byte.MAX_VALUE - 10);
        System.out.println("Byte Challenge Value = " + myNewByteChallenge);

        short myNewShortChallenge = (Short.MAX_VALUE - 10);
        System.out.println("Short Challenge Value = " + myNewShortChallenge);

        int myNewIntChallenge = (Integer.MAX_VALUE - 10);
        System.out.println("Int Challenge Value = " + myNewIntChallenge);

        long myNewLongChallenge = (50000L + 10L * (long) (myNewByteChallenge) + ((long) myNewShortChallenge + (long) myNewIntChallenge));
        System.out.println("Long Challenge Value = " + myNewLongChallenge);
    }
}
