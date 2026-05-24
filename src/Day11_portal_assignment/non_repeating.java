//1.Find first non-repeating character in a string.
package Day11_portal_assignment;
import java.util.Scanner;

public class non_repeating{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                System.out.println("First non-repeating character is: " + str.charAt(i));
                return;
            }
        }
        System.out.println("No non-repeating character found");
    }
}
