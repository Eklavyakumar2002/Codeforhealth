//9. Find grade based on marks (if-else-if ladder)
package Day1_portal_assignment;
import java.util.Scanner;
public class grade_system {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int marks = sc.nextInt();
	        System.out.println("enter marks");
	        if (marks >= 90) {
	            System.out.println("Grade A");
	        }
	        else if (marks >= 75) {
	            System.out.println("Grade B");
	        }
	        else if (marks >= 50) {
	            System.out.println("Grade C");
	        }
	        else {
	            System.out.println("Fail");
	        }
	    }
}
