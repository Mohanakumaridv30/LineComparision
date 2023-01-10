package com.bridgelabz.linecomparision;

import java.util.Scanner;

public class LineComparisionEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Cooordinates of first line1 ");
        System.out.println("Enter the Cooordinates of x1 and y1 : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter the Co-ordinates of x2 and y2 : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        Double len1 = Math.sqrt((x2 - x1) * (x2 - x1)  +  (y2 - y1) * (y2 - y1));
        System.out.println();
        System.out.println("Enter the Coordinates of second line2 ");
        System.out.println("Enter the Coordinates of x3 and y3 : ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        System.out.println("Enter the Coordinates of x4 and y4 : ");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        Double len2 = Math.sqrt((x4 - x3) * (x4 - x3)  +  (y4 - y3) * (y4 - y3));
        System.out.println("Length of the first line1 is : " + len1 + " units" );
        System.out.println("Length of the second line2 is : " + len2 + " units" );
        System.out.println();
        if(len1.compareTo(len2) == 1)
            System.out.println("Length of Line 1 is GREATER than Line 2 ");
        else if (len1.compareTo(len2) == -1)
            System.out.println("Length of Line 1 is LESS than Line 2 ");
        else
            System.out.println("Both lines are EQUAL in length");
        sc.close();
    }
}