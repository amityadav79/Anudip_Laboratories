 import java.util.Scanner;
 class DigitFrequencies {
    private  int number;
    int[] digitCount = new int[10];

    public DigitFrequencies(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Frequency: ");
        number=sc.nextInt();
        System.out.println("----------------------");
    }

    public void ExtractDigit(){
        while (number > 0) {
            int digit = number % 10;
            digitCount[digit]++;
            number /= 10;
        }
    }

    public void PrintFrequency(){
        for (int i = 0; i < 10; i++) {
            if (digitCount[i] > 0) {
                System.out.println("Frequency of " + i + " : " + digitCount[i]);
            }
        }
    }

}




class DigitFrequency{
    public static void main(String[] args) {
        DigitFrequencies d= new DigitFrequencies();

       d.ExtractDigit();
       d.PrintFrequency();   
    }
}
