//3. Find elements present in either of the sets but not both.
package Day7_portal_Assignment;
import java.util.*;

public class Symmetric_difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        System.out.print("Enter size of first set: ");
        int n1 = sc.nextInt();
        System.out.println("Enter elements:");
        for(int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }
        System.out.print("Enter size of second set: ");
        int n2 = sc.nextInt();
        System.out.println("Enter elements:");
        for(int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }

        for(int val : set1) {
            if(!set2.contains(val)) {
                result.add(val);
            }
        }
        for(int val : set2) {
            if(!set1.contains(val)) {
                result.add(val);
            }
        }
        System.out.println("Symmetric difference: " + result);
        sc.close();
    }
}