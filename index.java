import java.util.Scanner;

public class index{

    // Method to check triangle type
    public static String checkTriangleType(double a, double b, double c) {
        // Check for triangle validity
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Not a valid triangle";
        }

        // Check for equal sides
        if (a == b && b == c) {
            return "Equilateral Triangle";
        } else if (a == b || b == c || a == c) {
            return "Isosceles Triangle";
        } else {
            // Sort sides to apply Pythagorean theorem logic
            double[] sides = {a, b, c};
            java.util.Arrays.sort(sides);

            double x = sides[0];
            double y = sides[1];
            double z = sides[2];

            // Compare squares to determine triangle type
            double sumSquares = x * x + y * y;
            double largestSquare = z * z;

            if (sumSquares > largestSquare) {
                return "Acute Triangle";
            } else if (sumSquares == largestSquare) {
                return "Right-Angled Triangle";
            } else {
                return "Obtuse Triangle";
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three sides of a triangle:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        String result = checkTriangleType(a, b, c);
        System.out.println("Triangle Type: " + result);

        sc.close();
    }
}
