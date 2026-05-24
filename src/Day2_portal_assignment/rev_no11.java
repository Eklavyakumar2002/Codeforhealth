 // 11.Write a program to reverse a given number using a while loop.
package Day2_portal_assignment;
import java.util.Scanner;
	public class rev_no11{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Entern:");
			int n=sc.nextInt();
			int rev=0;
			while(n!=0){
				int d=n%10;
				rev=rev*10+d;
				n=n/10;
			}
			System.out.println("Rev:"+rev);
		}
}
