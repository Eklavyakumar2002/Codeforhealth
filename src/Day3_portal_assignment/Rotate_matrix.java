//5. Rotate matrix by 90 degrees.
package Day3_portal_assignment;
import java.util.Scanner;
public class Rotate_matrix {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size(n for matrix): ");
	        int n = sc.nextInt();
	        int arr[][] = new int[n][n];
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                arr[i][j] = sc.nextInt();
	            }
	        }
	        for (int i = 0; i < n; i++) {
	            for (int j = i; j < n; j++) {
	                int temp = arr[i][j];
	                arr[i][j] = arr[j][i];
	                arr[j][i] = temp;
	            }
	        }
	        for (int i = 0; i < n; i++) {
	            int start = 0, end = n - 1;

	            while (start < end) {
	                int temp = arr[i][start];
	                arr[i][start] = arr[i][end];
	                arr[i][end] = temp;

	                start++;
	                end--;
	            }
	        }
	        System.out.println("Rotated matrix:");
	        for(int i = 0; i < n; i++) {
	            for(int j = 0; j < n; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	        sc.close();
	    }
	 }

