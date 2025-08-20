import java.util.Scanner;

public class FeetToYardMile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Conversions
        double distanceInYards = distanceInFeet / 3;       // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760;   // 1 mile = 1760 yards

        // Output
        System.out.println("The distance in yards is " + distanceInYards +
                           " while the distance in miles is " + distanceInMiles);

        sc.close();
    }
}