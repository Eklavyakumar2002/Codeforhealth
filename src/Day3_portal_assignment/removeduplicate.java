//2. Remove duplicate elements from an array.
package Day3_portal_assignment;
import java.util.*;
public class removeduplicate {
	
	    public static void main(String[] args) {
	        Scanner sc =new Scanner(System.in);
	        System.out.print("Enter size:");
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        HashSet<Integer> set = new HashSet<>();
	        for (int i = 0; i < n; i++) {
	            set.add(arr[i]);
	        }
	        System.out.println("After removing duplicate:");
	        for (int x: set) {
	            System.out.print(x + " ");
	        }

	        sc.close();
	    }
	}

