//14.Display day of week using switch case 
package Day1_portal_assignment;
import java.util.Scanner;
public class simple_calc {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Choose:1.Add 2.Subtract 3.Multiply 4.Divide");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Ans= " + (a + b));
                break;
            case 2:
                System.out.println("Ans=" + (a - b));
                break;
            case 3:
                System.out.println("Ans= " +(a * b));
                break;
            case 4:
                System.out.println("Ans=" +(a / b));
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
