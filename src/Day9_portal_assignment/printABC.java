//2.Print A B C in Sequence Three threads print A, B, C repeatedly in order (ABCABC…)
package Day9_portal_assignment;

class SequencePrinter {
    int flag = 1;
    public synchronized void showA() {
        while (true) {
            while (flag != 1) {
                try { wait(); } catch (Exception e) {}
            }
            System.out.print("A ");
            flag = 2;
            notifyAll();
        }
    }
    public synchronized void showB() {
        while (true) {
            while (flag != 2) {
                try { wait(); } catch (Exception e) {}
            }
            System.out.print("B ");
            flag = 3;
            notifyAll();
        }
    }
    public synchronized void showC() {
        while (true) {
            while (flag != 3) {
                try { wait(); } catch (Exception e) {}
            }
            System.out.print("C ");
            flag = 1;
            notifyAll();
        }
    }
}
public class printABC{
    public static void main(String[] args) {
        SequencePrinter obj = new SequencePrinter();
        Thread t1 = new Thread(() -> obj.showA());
        Thread t2 = new Thread(() -> obj.showB());
        Thread t3 = new Thread(() -> obj.showC());

        t1.start();
        t2.start();
        t3.start();
    }
}