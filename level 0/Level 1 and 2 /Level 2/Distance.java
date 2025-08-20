import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Conversion: 1 yard = 3 feet
        double distanceInYards = distanceInFeet / 3;

        // Conversion: 1 mile = 1760 yards
        double distanceInMiles = distanceInYards / 1760;

        // Output
        System.out.println("The distance in yards is " + distanceInYards +
                           " while the distance in miles is " + distanceInMiles);

        sc.close();
    }
} 