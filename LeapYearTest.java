import java.util.Scanner;

class LeapYear {
    private int year;

    // Constructor
    public LeapYear(int year) {
        this.year = year;
    }

    // Method to check if the year is a leap year
    public boolean isLeapYear() {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
}

public class LeapYearTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        LeapYear leapYear = new LeapYear(year);

        if (leapYear.isLeapYear()) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
