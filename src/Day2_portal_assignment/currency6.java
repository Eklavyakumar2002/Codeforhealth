//6.Write a program that converts currency based on user choice (e.g., INR to USD, INR to EUR, etc.).
package Day2_portal_assignment;
import java.util.Scanner;
public class currency6 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("1.INRtoUSD");
	System.out.println("2.INRtoEUR");
	System.out.println("Enterchoice:");
	
	int ch=sc.nextInt();
	System.out.println("EnterINR:");
	double amt=sc.nextDouble();
	switch(ch){
	case 1:
		System.out.println("USD:"+(amt*0.012));
		break;
	case 2:
		System.out.println("EUR:"+(amt*0.011));
		break;
	default:
		System.out.println("Invalid");
	}
	}
	}

