import java.util.Scanner;

class MaxOfTwoNumbers {
	private int num1,num2;
	
	public MaxOfTwoNumbers(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number: ");
		num1= sc.nextInt();
       	num2= sc.nextInt();
		System.out.println("--------------------");
	}

 	public void FindMaxNum(){
 	// Use the ternary operator to find the maximum of the two numbers
        int max = (num1 > num2) ? num1 : num2;
	// Output the maximum number
        System.out.println("The maximum of the two numbers is: " + max);
   }
}

class MaxNumber{
	public static void main(String a[]){
		MaxOfTwoNumbers m= new MaxOfTwoNumbers();
		m.FindMaxNum();
	  }
	}
		



















    
