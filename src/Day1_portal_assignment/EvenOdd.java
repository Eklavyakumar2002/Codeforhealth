//2. Check whether a number is even or odd 
package Day1_portal_assignment;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
	}
}
