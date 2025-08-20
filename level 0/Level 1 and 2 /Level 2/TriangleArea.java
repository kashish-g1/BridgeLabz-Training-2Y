import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter base of the triangle (in cm): ");
        double base = sc.nextDouble();

        System.out.print("Enter height of the triangle (in cm): ");
        double height = sc.nextDouble();

        // Formula: Area = 1/2 * base * height (in sq cm)
        double areaSqCm = 0.5 * base * height;

        // Conversion: 1 inch = 2.54 cm → 1 sq inch = (2.54 * 2.54) sq cm
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // Output
        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);

        sc.close();
    }
}