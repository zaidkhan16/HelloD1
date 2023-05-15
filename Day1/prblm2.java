//Q3.take marks of 4 subjects and calculate the total and average if average is >90 then grade A between 80 to 90  grade b between 70 to 80  grade c less than 70 fail
import java.util.Scanner;

public class prblm2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Marks of Main Four Subject :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		System.out.println("Total of Main Four Subject is ="+(a+b+c+d));
		
		int avg=(a+b+c+d)/4;
		System.out.println("Average of Main Four Subject is ="+avg);
		
		
		if(avg>=90)
		{
			System.out.println("Grade A");
		}
		else if(90>avg && avg<80)
		{
			System.out.println("Grade B");
		}
		else if(80>=avg && avg>70)
		{
			System.out.println("Grade C");
		}
		else if(70>avg)
		{
			System.out.println("Fail");
		}
	}

}
