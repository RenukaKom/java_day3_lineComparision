package com.bridgelabz.linecomparision;
    /* As a fan of geometry, I want to model a line based on a point
 consisting of (x, y) co-ordinates using the Cartesian system, So that I can calculate its length.*/
import java.util.Scanner;
public class LengthOfLineUC1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the co-ordinates of point A");
            double x1 = sc.nextInt();
            double x2 = sc.nextInt();
            System.out.println("Enter the co-ordinates of point B");
            double y1 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            System.out.println("Distance between two points is : " + distance);
        }
}
