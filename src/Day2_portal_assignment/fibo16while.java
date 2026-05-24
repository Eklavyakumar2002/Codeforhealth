//16.Write a program to print Fibonacci series up to N terms using a while loop.
package Day2_portal_assignment;
import java.util.Scanner;
	public class fibo16while {
		
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Entern:");
			int n=sc.nextInt();
			int a=0,b=1,i=1;
			while(i<=n){
				System.out.print(a+" ");
				int c=a+b;
				a=b;
				b=c;
				i++;
			}
		}
	}
