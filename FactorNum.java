import java.util.Scanner;

class Factor{
    private int num;

    public Factor(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        num=sc.nextInt();
        System.out.println("-----------------------------");
    }

    public void FactorChecker(){
        System.out.print("Factor of "+num+" "+"is: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
    }
}
}

class FactorNum{
    public static void main(String[] args) {
        new Factor().FactorChecker();
    }
}