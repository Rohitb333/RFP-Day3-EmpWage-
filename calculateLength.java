package com.javapackage;

public class calculateLength {
    public static void main(String[] args) {

        // For point A
        double x1 = 2;
        double y1 = 1;

        // For point B
        double x2 = 7;
        double y2 = 3;

        // Calculate length between two points
        double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1)
                * (y2 - y1));

        System.out.println("Length between two points :" + length);

    }
}
