//3.Bank Account System Multiple threads deposit and withdraw from same account safely
package Day9_portal_assignment;
	class Account {
	    int balance = 1000;
	    public synchronized void deposit(int amount) {
	        balance = balance + amount;
	        System.out.println("Deposited: " + amount + " Balance: " + balance);
	    }
	    public synchronized void withdraw(int amount) {
	        if (balance >= amount) {
	            balance = balance - amount;
	            System.out.println("Withdrawn: " + amount + " Balance: " + balance);
	        } else {
	            System.out.println("Insufficient balance");
	        }
	    }
	}
	public class Banking_system{
	    public static void main(String[] args) {
	        Account acc = new Account();

	        Thread t1 = new Thread(() -> {
	            acc.deposit(500);
	            acc.deposit(300);
	        });
	        Thread t2 = new Thread(() -> {
	            acc.withdraw(400);
	            acc.withdraw(800);
	        });
	        t1.start();
	        t2.start();
	    }
	}