//9.Write a program to print the multiplication table of a given number using a while loop.
package Day2_portal_assignment;
import java.util.Scanner;
public class multiplication_table9 {
	
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no:");
	int n=sc.nextInt();
	int i=1;
	while(i<=10){
	System.out.println(n+"*"+i+"="+(n*i));
	i++;
	}
	}
	}

