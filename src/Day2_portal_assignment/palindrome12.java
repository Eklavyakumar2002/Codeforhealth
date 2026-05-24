//12. Write a program to check whether a number is a palindrome using a while loop
package Day2_portal_assignment;
import java.util.Scanner;

public class palindrome12 {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Entern:");
		int n=sc.nextInt();
		int temp=n,rev=0;
		while(n!=0){
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		if(temp==rev)System.out.println("Palindrome");
		else System.out.println("NotPalindrome");
}
}