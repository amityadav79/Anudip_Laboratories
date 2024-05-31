public class Bank {
    // Declare an instance variable named amount
    private double amount;

    // Parameterized constructor to initialize variable "amount" with value 10000
    public Bank(double initialAmount) {
        this.amount = initialAmount;
    }

    // Method to withdraw an amount
    public void withdraw(double withdrawalAmount) {
        // Check if the withdrawal amount is less than or equal to the current amount
        String message = (withdrawalAmount <= amount) ? "Withdraw successful" : "Insufficient funds";
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }
        // Print the withdrawal message
        System.out.println(message);
    }

    // Method to deposit an amount
    public void deposit(double depositAmount) {
        // Add the deposit amount to the current amount
        amount += depositAmount;
        // Print the deposit message
        System.out.println("Deposit successful");
    }

    // Method to display the current balance
    public void displayBalance() {
        // Print the current balance
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
        // Create a Bank object with initial amount 10000
        Bank myBankAccount = new Bank(10000);

        // Withdraw 3000 from the account
        myBankAccount.withdraw(3000);

        // Deposit 5000 into the account
        myBankAccount.deposit(5000);

        // Display the total balance
        myBankAccount.displayBalance();
    }
}
