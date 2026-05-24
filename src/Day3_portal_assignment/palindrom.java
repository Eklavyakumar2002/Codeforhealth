//4. Check if array is palindrome.
package Day3_portal_assignment;
import java.util.Scanner;
public class palindrom {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n =sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isPalindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome array");
        } else {
            System.out.println("Not a palindrome");
        }
        sc.close();
    }
}
