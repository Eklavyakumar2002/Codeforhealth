//4.Online Food Delivery System Multiple orders processed by limited delivery agents (thread pool).
package Day9_portal_assignment;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class FoodOrder implements Runnable {
    int orderId;
    FoodOrder(int orderId) {
        this.orderId = orderId;
    }
    
    public void run() {
        System.out.println("Order " + orderId + " is being delivered by " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        System.out.println("Order " + orderId + " delivered");
    }
}
public class online_fooddelivery{
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 4; i++) {
            pool.execute(new FoodOrder(i));
        }
        pool.shutdown();
    }
}