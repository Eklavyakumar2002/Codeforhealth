//1.First Non-Repeating Character Find the first non-repeating character in a string using HashMap.
package Day8_portal_assignment;
import java.util.*;
public class first_non_Repeating {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter string: ");
	        String s = sc.nextLine();
	        HashMap<Character, Integer> map = new HashMap<>();
	        for (char ch : s.toCharArray()) {
	            if (map.containsKey(ch)) {
	                map.put(ch, map.get(ch) + 1);
	            } else {
	                map.put(ch, 1);
	            }
	        }
	        for (char ch : s.toCharArray()) {
	            if (map.get(ch) == 1) {
	                System.out.println("First non-repeating: " + ch);
	                return;
	            }
	        }
	        System.out.println("No unique character");
	    }
	}