//sort an array in accending and decending order
package Day3_portal_assignment;
import java.util.Scanner;
public class Sortarray {
	
	    public static void main(String[] args) {
	        Scanner sc =new Scanner(System.in);
	        System.out.print("Enter size of array: ");
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] > arr[j]) {
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	        System.out.println("Ascending order:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] < arr[j]) {
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }

	        System.out.println("\nDescending order:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }

	        sc.close();
	    }
	}

