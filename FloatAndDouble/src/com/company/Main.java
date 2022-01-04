package com.company;

public class Main {

    public static void main(String[] args) {
	
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
//        using cast to float here as java assumes this number literal to be a double
        float myFloatValue = (float) 5.25;
        float thisFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        double thisDoubleValue = 5.00 / 3.00;
        System.out.println("My Int Value = " + myIntValue);
        System.out.println("My Float Value = " + thisFloatValue);
        System.out.println("My Double Value = " + myDoubleValue);
        System.out.println("This Double Value = " + thisDoubleValue);
    }
}
