//11. Find the smallest of three numbers
package Day1_portal_assignment;
import java.util.Scanner;
public class smallest_of_three {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        if (a<b && a<c) {
	            System.out.println("Smallest:"+a);
	        }
	        else if(b<c) {
	            System.out.println("Smallest:"+b);
	        }
	        else {
	            System.out.println("Smallest:"+c);
	        }
	}

}
