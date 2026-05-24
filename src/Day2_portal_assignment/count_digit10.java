//10.Write a program to count the number of digits in a given number using a while loop.

package Day2_portal_assignment;
import java.util.Scanner;
public class count_digit10 {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Entern:");
		int n=sc.nextInt();
		int c=0;
		while(n!=0){
			n=n/10;
			c++;
		}
		System.out.println("Digits:"+c);
		}
	}


