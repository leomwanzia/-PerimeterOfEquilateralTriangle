# -PerimeterOfEquilateralTriangle

Detailed Steps:

Import Scanner:

    import java.util.Scanner; imports the Scanner class to read user input.

Main Method:

    Scanner in = new Scanner(System.in); creates a Scanner object named in to read input from the user.

    System.out.println("Enter the length of the side of the equilateral triangle:"); prompts the user to enter the side length.

    double side = in.nextDouble(); reads the side length from the user.
    
    double perimeter = calculatePerimeter(side); calls the calculatePerimeter method to compute the perimeter.

    System.out.println("The perimeter of the equilateral triangle is: " + perimeter); prints the calculated perimeter.

    in.close(); closes the Scanner object to free up resources.

    calculatePerimeter Method:

    The formula 3 * side calculates the perimeter of the equilateral triangle.

The result is stored in the variable perimeter.

The return perimeter; statement returns the computed perimeter to the caller of the method.
