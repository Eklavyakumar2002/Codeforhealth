//3. Find the largest of two numbers
package Day1_portal_assignment;
import java.util.Scanner;
public class largestof_two {
	public static void main(String[] args) {
		System.out.println("enter a:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("enter b:");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println("a is largest");
		}
		else {
			System.out.println("b is largest");
		}
	}
}
