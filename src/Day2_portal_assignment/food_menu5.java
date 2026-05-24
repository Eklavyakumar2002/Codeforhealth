//5.Create a program where user selects food item number and the program displays item name and
package Day2_portal_assignment;
import java.util.Scanner;
public class food_menu5 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("1. Pizza 200");
	        System.out.println("2. Burger 100");
	        System.out.println("3. Sandwich 80");
	        System.out.println("4. Drink 50");
	        int ch = sc.nextInt();
	        switch (ch) {
	            case 1:
	                System.out.println("Pizza 200");
	                break;
	            case 2:
	                System.out.println("Burger 100");
	                break;
	            case 3:
	                System.out.println("Sandwich 80");
	                break;
	            case 4:
	                System.out.println("Drink 50");
	                break;
	            default:
	                System.out.println("Invalid");
	        }
	    }
	}
