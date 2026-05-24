//7.Create a program that checks user role (Admin, User, Guest) and displays access permissions.
package Day2_portal_assignment;
import java.util.Scanner;

public class admin_user7 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enterrole:");
		String r=sc.next();
		switch(r){
		case "Admin":
			System.out.println("Fullaccess");
			break;
		case "User":
			System.out.println("Limitedaccess");
			break;
		case "Guest":
			System.out.println("Viewonly");
			break;
		default:System.out.println("Invalid");
		}
		}
}
