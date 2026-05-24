//7. Check eligibility for voting based on age 
package Day1_portal_assignment;
import java.util.Scanner;
public class voting_eligibility{
	    public static void main(String[] args) {
	        Scanner sc =new Scanner(System.in);
	        System.out.println("enter the age:");
	        int age=sc.nextInt();
	        if(age>=18){
	            System.out.println("Eligible");
	        }
	        else{
	            System.out.println("Not Eligible");
	        }
	    }
}
