import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Addition {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		System.out.println("*****Addition******");
		System.out.println("Enter Num1");
		int Num1=sc.nextInt();
		System.out.println("enter Num2");
		int Num2=sc.nextInt();
		int Num=Num1+Num2;
		System.out.println("Addition of the two number is :"+Num);
		
		
		
	}

}
