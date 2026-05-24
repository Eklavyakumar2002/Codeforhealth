//10.Check whether a number is zero, positive, or negative
package Day1_portal_assignment;
import java.util.Scanner;
public class check_number{
	public static void main(String[] args) {
		System.out.println("Enter the nos: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0) {
			System.out.println("positive");
		}
		else if(n==0) {
			System.out.println("zero");
		}
		else {
			System.out.println("negative");
		}
	}

}