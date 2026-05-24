//13.Check whether a number is divisible by 3 or 7 
package Day1_portal_assignment;
import java.util.Scanner;
public class divsibility_3_7 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no:");
        int num = sc.nextInt();
        if (num% 3==0 || num%7== 0) {
            System.out.println("Divisible");
        }
        else {
            System.out.println("Not Divisible");
        }
    }
}
