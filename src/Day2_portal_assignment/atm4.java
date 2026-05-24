//4. Create a menu-driven program for ATM operations:
package Day2_portal_assignment;
import java.util.Scanner;
public class atm4 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	    int ch;
        int bal = 1000;

        do {
            System.out.println("1 Balance");
            System.out.println("2 Deposit");
            System.out.println("3 Withdraw");
            System.out.println("4 Exit");
            System.out.println("Enter choice:");

            ch = sc.nextInt();

            switch(ch) {
                case 1:
                    System.out.println("Bal: " + bal);
                    break;

                case 2:
                    System.out.println("Enter amt:");
                    int d = sc.nextInt();
                    bal = bal + d;
                    System.out.println("Done");
                    break;
                case 3:
                    System.out.println("Enter amt:");
                    int w = sc.nextInt();
                    if (w <= bal) {
                        bal = bal - w;
                        System.out.println("Done");
                    } else {
                        System.out.println("No bal");
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid");
            }

        } while (ch != 4);
	}
}
