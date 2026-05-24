//2.Online Shopping Cart Use List for cart, Map for product-price mapping.
package Day8_portal_assignment;

import java.util.*;

public class online_shoppingcart_usingmap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> priceMap = new HashMap<>();
        priceMap.put("apple", 50);
        priceMap.put("milk", 40);
        priceMap.put("bread", 30);
        priceMap.put("banana", 20);

   
        ArrayList<String> cartList = new ArrayList<>();
        System.out.println("Available items: " + priceMap.keySet());
        System.out.print("How many items you want to add: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item name: ");
            String itemName = sc.nextLine().toLowerCase();

            if (priceMap.containsKey(itemName)) {
                cartList.add(itemName);
            } else {
                System.out.println("Item not available");
                i--;
            }
        }
        System.out.println("Your cart: " + cartList);
        int total = 0;
        for (String item : cartList) {
            total = total + priceMap.get(item);
        }
        System.out.println("Total bill: " + total);

        sc.close();
    }
}