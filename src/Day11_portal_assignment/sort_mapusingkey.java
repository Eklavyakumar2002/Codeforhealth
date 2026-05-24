//4.Sort a map by keys.
package Day11_portal_assignment;
import java.util.*;

public class sort_mapusingkey{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> data = new HashMap<>();
        System.out.print("Enter n");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter key: ");
            String key = sc.nextLine();
            System.out.print("Enter value: ");
            int value = sc.nextInt();
            sc.nextLine();

            data.put(key, value);
        }
        TreeMap<String, Integer> sortedMap = new TreeMap<>(data);
        System.out.println("Sorted Map: " + sortedMap);
        sc.close();
    }
}
