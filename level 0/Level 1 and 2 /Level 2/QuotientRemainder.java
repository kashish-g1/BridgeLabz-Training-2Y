import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        // Calculation (handling divide by zero case)
        if (number2 != 0) {
            int quotient = number1 / number2;   // Division operator
            int remainder = number1 % number2;  // Modulus operator

            // Output
            System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
                               " of two numbers " + number1 + " and " + number2);
        } else {
            System.out.println("Division by zero is not allowed!");
        }

        sc.close();
    }
}