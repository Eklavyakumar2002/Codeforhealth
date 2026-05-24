//2. Create an abstract class Bank with method getInterestRate() and implement it in different bank classes.
package Day5_portal_assignment;
abstract class Bank {
    public abstract double getInterestRate();
}
class SBI extends Bank {
    public double getInterestRate() {
        return 6.15;
    }
}
class HDFC extends Bank {
    public double getInterestRate() {
        return 7.10;
    }
}
class ICICI extends Bank {
    public double getInterestRate() {
        return 6.02;
    }
}
public class bank_abstractclass{
    public static void main(String[] args) {

        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();
        
        System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + b2.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + b3.getInterestRate() + "%");
    }
}