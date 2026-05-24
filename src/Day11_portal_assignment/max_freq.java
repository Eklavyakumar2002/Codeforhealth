//3.Find element with maximum frequency.
package Day11_portal_assignment;
import java.util.*;
public class max_freq{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        char maxChar = s.charAt(0);
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println(maxChar);
    }
}