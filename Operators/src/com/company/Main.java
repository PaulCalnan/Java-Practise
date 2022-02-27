package com.company;

import javax.xml.transform.stream.StreamSource;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previous result = " + previousResult);
        result = result -1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previous result still = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of ( 4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        //Abbreviations
        // result = result + 1...
        result++;
        System.out.println("1 + 1 = " + result);
        result--;
        System.out.println("2 - 1 = " + result);
        result += 2;
        System.out.println("result = result + 2 = " + result);
        result *= 10;
        System.out.println("result = result * 10 = " + result);
        result /= 3;
        System.out.println("result = result / 3 = " + result);
        result -= 2;
        System.out.println("result = result - 2 = " + result);

        boolean isAlien = false;
        if ( isAlien == false) {
            System.out.println("It is not an alien!");
        } else {
            System.out.println("It is an Alien!!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        // this evaluates to true and prints the statement as the condition looks if a boolean is present via single =
        boolean isCar = false;
        if (isCar = true) { // could also write "if (isCar)" as a shortcut to check true or "if (!isCar)" to check false
            System.out.println("This is not supposed to happen");
        }

        // ternary operator is a shortcut to assigning one of two values to a variable depending on a given condition.
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        } else {
            System.out.println("wasCar is false");
        }

        int ageOfClient = 17;

        boolean isEighteenOrOver = (ageOfClient >= 18) ? true : false;
        if (isEighteenOrOver) {
            System.out.println("Client is over 18");
        } else {
            System.out.println("Client is under 18");
        }

        double num1 = 20.00;
        double num2 = 80.00;
        double result1 = (num1 + num2) * 100.00;
        double result2 = result1 % 41;

        System.out.println("Add both numbers together and multiply by 100 = " + result1);
        System.out.println("remainder from step one and 40.00 = " + result2);
        boolean isZero = ((int) result2 == 0) ? true : false;
        System.out.println("isZero = " + result2);
        if(!isZero) {
            System.out.println("remainder = " + result2);
        }
    }
}
