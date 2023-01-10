package com.bridgelabz.linecomparision;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Cooordinates of x1 and y1 : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter the Coordinates of x2 and y2 : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double len = Math.sqrt((3 - 10) * (3 - 10)  +  (4 - 11) * (4 - 11));
        System.out.println("Length of the given Line is : " + len + " units" );
        sc.close();
    }
}