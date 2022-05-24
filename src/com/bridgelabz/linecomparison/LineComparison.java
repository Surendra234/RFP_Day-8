package com.bridgelabz.linecomparison;

public class LineComparison {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public LineComparison(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double lengthOfLine() {
        double length = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) +(y2-y1));
        return length;
    }
    public static void checkEquality(Double lengthOfLine1,Double lengthOfLine2) {

        if(lengthOfLine1.equals(lengthOfLine2))
            System.out.println("Length of Lines are equal");
        else
            System.out.println("Length are not equal");
    }
    public static void ComparisonOfLines(Double lengthOfLine1,Double lengthOfLine2) {

        if (lengthOfLine1.compareTo(lengthOfLine2) > 0) {
            System.out.println("Line1 is greater then from Line2");
        } else if (lengthOfLine1.compareTo(lengthOfLine2) < 0) {
            System.out.println("Line1 is lesser then from line2");
        } else {
            System.out.println("Length of Line1 and Line2 are equals");
        }
    }
}