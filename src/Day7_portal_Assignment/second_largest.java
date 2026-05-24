//1.Find the second largest element in a List<Integer>.
package Day7_portal_Assignment;
import java.util.*;
public class second_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many values: ");
        int count = sc.nextInt();
        List<Integer> data = new ArrayList<>();
        System.out.println("Enter the values:");
        for(int i = 0; i < count; i++) {
            data.add(sc.nextInt());
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int num : data) {

            if(num > first) {
                second = first;
                first = num;
            } 
            else if(num > second && num != first) {
                second = num;
            }
        }
        if(second == Integer.MIN_VALUE) {
            System.out.println("Second largest value not found");
        } else {
            System.out.println("Second largest value is " + second);
        }
        sc.close();
    }
}