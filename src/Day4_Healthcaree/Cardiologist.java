package Day4_Healthcaree;

public class Cardiologist extends Doctor {

    public Cardiologist(String name) {
        super(name);
    }
    public void diagnose(Patient p) {
        System.out.println("Dr. " + name + " checks " + p.getName());

        if (p.getIllness().toLowerCase().contains("heart")) {
            System.out.println("Heart treatment given");
        } else {
            System.out.println("Refer to general doctor");
        }
    }
}