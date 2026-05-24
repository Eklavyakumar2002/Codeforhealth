//15.Write a program to check whether a number is prime using a while loop.

package Day2_portal_assignment;
import java.util.Scanner;

	public class prime15 {
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Entern:");
			int n=sc.nextInt();
			int i=2,flag=0;
			while(i<n){
				if(n%i==0){
					flag=1;
					break;
				}
				i++;
			}
			if(n<=1)System.out.println("NotPrime");
			else if(flag==0)System.out.println("Prime");
			else System.out.println("NotPrime");
	}
	}
