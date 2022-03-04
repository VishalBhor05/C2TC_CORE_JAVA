import java.util.Scanner;

public class OddEvenNo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);	
		
 		System.out.println("Enetr the Given number :");	
		int Num = sc.nextInt(); 
		
		
		if(Num % 2 != 0) 	
		{
			System.out.println(Num+" is Odd Number "); 	
		}
		
		
		else
		{
			System.out.println(Num+" is Even Number");		
		}
	}

}
