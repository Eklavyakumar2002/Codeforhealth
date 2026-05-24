//8. Check whether a number is divisible by 5 and 11
package Day1_portal_assignment;
import java.util.Scanner;
public class divisibility {
	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no");
        int num= sc.nextInt();
        if (num % 5 == 0 && num % 11 == 0)
            System.out.println("Divisible");
        else
            System.out.println("Not Divisible");
    }
}
