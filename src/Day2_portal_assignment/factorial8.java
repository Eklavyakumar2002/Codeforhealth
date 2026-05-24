//8.Write a program to calculate the factorial of a given number using a while loop.

package Day2_portal_assignment;
import java.util.Scanner;
public class factorial8 {
	
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no:");
	int n=sc.nextInt();
	int i=1,f=1;
	while(i<=n){
	f=f*i;
	i++;
	}
	System.out.println("Factorial:"+f);
	}
	}

