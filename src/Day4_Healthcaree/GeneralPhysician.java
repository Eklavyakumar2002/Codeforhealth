package Day4_Healthcaree;

public class GeneralPhysician extends Doctor {

   
    public GeneralPhysician(String name) {
        super(name);
    }

    public void diagnose(Patient p) {
        System.out.println("Dr. " + name + " treats " + p.getName());
        System.out.println("General treatment for: " + p.getIllness());
    }
}