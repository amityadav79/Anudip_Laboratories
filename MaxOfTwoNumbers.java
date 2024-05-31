import java.util.Scanner;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Use the ternary operator to find the maximum of the two numbers
        int max = (num1 > num2) ? num1 : num2;

        // Output the maximum number
        System.out.println("The maximum of the two numbers is: " + max);

            }
}
