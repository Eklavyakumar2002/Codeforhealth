//1.Alternate Printing (Even-Odd) Create two threads: one prints even numbers, another prints odd numbers (1–100) in sequence.
package Day9_portal_assignment;
class NumberPrinter {
    int num = 1;
    int max = 100;
    public synchronized void printOdd() {
        while (num <= max) {
            if (num % 2 == 0) {
                try { wait(); } catch (Exception e) {}
            } else {
                System.out.print(num + " ");
                num++;
                notify();
            }
        }
    }
    public synchronized void printEven() {
        while (num <= max) {
            if (num % 2 != 0) {
                try { wait(); } catch (Exception e) {}
            } else {
                System.out.print(num + " ");
                num++;
                notify();
            }
        }
    }
}
public class alternate_evenOdd{
    public static void main(String[] args) {
        NumberPrinter obj = new NumberPrinter();
        Thread t1 = new Thread(() -> obj.printOdd());
        Thread t2 = new Thread(() -> obj.printEven());

        t1.start();
        t2.start();
    }
}
