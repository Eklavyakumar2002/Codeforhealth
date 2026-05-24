//14.Write a program to check whether a number is an Armstrong number using a while loop.
package Day2_portal_assignment;
import java.util.Scanner;
		
	public class armstrong14{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Entern:");
			int n=sc.nextInt();
			int temp=n,sum=0;
			while(n!=0){
				int d=n%10;
				sum=sum+(d*d*d);
				n=n/10;
			}
			if(sum==temp)System.out.println("Armstrong");
			else System.out.println("NotArmstrong");
	}
	}

