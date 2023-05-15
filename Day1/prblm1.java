//Print Bigger Number by using Condition Statement
import java.util.Scanner;

		public class prblm1 
		{
		    public static void main(String[] args) 
		    {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the first number: ");
		        int a = sc.nextInt();

		        System.out.print("Enter the second number: ");
		        int b = sc.nextInt();

		        int biggerNumber = (a > b) ? a : b;

		        System.out.println("The bigger number is: " + biggerNumber);
		    }
		}

