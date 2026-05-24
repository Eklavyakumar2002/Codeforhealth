//12.Check whether a person is eligible for a loan
package Day1_portal_assignment;
import java.util.Scanner;
public class loan_eligibility {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter age and salary");
	        int age = sc.nextInt();
	        double salary = sc.nextDouble();
	        if (age >= 21 && salary >= 25000) {
	        	
	            System.out.println("Eligible for Loan");
	        }
	        else {
	            System.out.println("Not Eligible");
	    }
	}
}
