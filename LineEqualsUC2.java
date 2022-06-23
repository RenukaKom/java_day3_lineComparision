package com.bridgelabz.linecomparision;

import java.util.Scanner;

//As a fan of geometry, I want to check equality of two lines based on the end points, So that I know when two lines are the equal.
public class LineEqualsUC2 {
    static double x1, x2, y1, y2, p1, p2, q1, q2;
    static String distance, line2distance;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinates of point x");
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        System.out.println("Enter the co-ordinates of point y");
        y1 = sc.nextDouble();
        y2 = sc.nextDouble();
        Scanner line2 = new Scanner(System.in);
        System.out.println("Enter the co-ordinates for line 2  x");
        p1 = line2.nextInt();
        p2 = line2.nextInt();
        System.out.println("Enter the co-ordinates for line 2 point y");
        q1 = line2.nextDouble();
        q2 = line2.nextDouble();
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Distance between two co-ordinates of line 1 is : " + distance);
        double line2distance = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));
        System.out.println("Distance between two co-ordinates of line 2 is : " + line2distance);
        String s1 = String.valueOf(distance);
        String s2 = String.valueOf(line2distance);
        System.out.println(s1.equals(s2));
        if (s1.equals(s2)) {
            System.out.println("Line 1 and Line 2 are equal");
        }else System.out.println("Line 1 and Line 2 are unequal");
    }
}