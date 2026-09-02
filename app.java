import java.util.Scanner;

public class LCMCalculator {

    // Method to compute GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // Always return positive GCD
    }

    // Method to compute LCM
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0; // LCM involving zero is zero
        }
        return Math.abs(a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second integer: ");
            int num2 = scanner.nextInt();

            int result = lcm(num1, num2);
            System.out.println("LCM of " + num1 + " and " + num2 + " is: " + result);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            scanner.close();
        }
    }
}
Features:
Handles negative numbers (LCM is always positive).
Handles zero (returns 0 if either number is zero).
Validates input to prevent crashes on invalid data.
Uses Euclidean algorithm for efficient GCD calculation.
Example Runs:

Copy code
Enter first integer: 12
Enter second integer: 18
LCM of 12 and 18 is: 36

Copy code
Enter first integer: -4
Enter second integer: 6
LCM of -4 and 6 is: 12

Copy code
Enter first integer: 0
Enter second integer: 5
LCM of 0 and 5 is: 0
If you want, I can also give you a Java version that reads multiple pairs of numbers in one run so you don’t have to restart the program each time.
Do you want me to prepare that?


