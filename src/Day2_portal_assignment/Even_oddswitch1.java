//1Write a program to check whether a number is even or odd using switch-case
package Day2_portal_assignment;
import java.util.Scanner;
public class Even_oddswitch1 {
	public class EvenOddSwitch {
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num= sc.nextInt();
	        int rem= num%2;
	        switch(rem) {
	            case 0:
	                System.out.println("Even number");
	                break;
	            case 1:
	            case -1:
	                System.out.println("Odd number");
	                break;
	            default:
	                System.out.println("Invalid");
	        }
	    }
	}}
