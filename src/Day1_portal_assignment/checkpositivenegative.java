//1.Check whether a number is positive or negative
package Day1_portal_assignment;
import java.util.Scanner;
public class checkpositivenegative {

	public static void main(String[] args) {
		System.out.println("Enter the nos: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0) {
			System.out.println("positive");
		}
		else {
			System.out.println("negative");
		}
	}

}
