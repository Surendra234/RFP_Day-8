package com.bridgelabz.linecomparison;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison program");

        LineComparison line1 = new LineComparison(23, 25, 27, 29);
        double lengthOfLine1 = line1.lengthOfLine();
        System.out.println("Length of line one = " + lengthOfLine1);

        LineComparison line2 = new LineComparison(32, 36, 38, 39);
        double lengthOfLine2 = line2.lengthOfLine();
        System.out.println("Length of line two = " + lengthOfLine2);

        LineComparison.ComparisonOfLines(lengthOfLine1,lengthOfLine2);
    }
}