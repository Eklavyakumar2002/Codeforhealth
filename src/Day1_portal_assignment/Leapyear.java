//5. Check whether a year is a leap year
package Day1_portal_assignment;
import java.util.Scanner;
public class Leapyear{
	    public static void main(String[] args) {
	        Scanner sc =new Scanner(System.in);
	        int year = sc.nextInt();
	        System.out.println("enter year:");
	        if ((year%4==0 && year%100!= 0)||year%400 == 0){
	            System.out.println("Leap Year");
	        }
	        else {
	            System.out.println("Not Leap Year");
	    }
	}
}
