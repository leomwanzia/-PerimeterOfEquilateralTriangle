package com.leo;

import java.util.Scanner;

public class PerimeterOfEqTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // FIRST METHOD

        //prompts user to input the length of the side of the triangle

//        System.out.print("Enter length of side: ");

//        //reads the input in double

//        double side = in.nextDouble();
//
//        //Perimeter = 3 * side

//        double perimeter = 3 * side;
//        System.out.println("The perimeter of the Equilateral triangle is: " + perimeter);

        // SECOND METHOD

        System.out.print("Enter the length of the Equilateral triangle: "); //prompt to enter the side of the eq triangle
        double side = in.nextDouble(); // reads the input in double

        // call the calculatePerimeter method to calculate the perimeter
        double perimeter = calculatePerimeter(side);
        // print the calculated perimeter
        System.out.println("The perimeter of the Equilateral triangle is: " + perimeter);

        in.close();

    }
    //define the method as static
    private static double calculatePerimeter(double side) {
        //perimeter = 3 * side
        double perimeter = 3 * side;

        return perimeter;
    }
}
