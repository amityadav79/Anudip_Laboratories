import java.util.Scanner;

class StrongNumber {
    private int number;

    // Constructor
    public StrongNumber(int number) {
        this.number = number;
    }

    // Method to compute factorial of a digit
    private int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if the number is a Strong number
    public boolean isStrong() {
        int originalNumber = this.number;
        int sumOfFactorials = 0;
        int tempNumber = this.number;

        // Calculate sum of factorials of digits
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sumOfFactorials += factorial(digit);
            tempNumber /= 10;
        }

        // Check if sum of factorials is equal to the original number
        return sumOfFactorials == originalNumber;
    }
}

public class StrongNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        StrongNumber strongNumber = new StrongNumber(number);

        if (strongNumber.isStrong()) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }

        scanner.close();
    }
}
