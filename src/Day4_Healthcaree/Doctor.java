package Day4_Healthcaree;


public abstract class Doctor {

    public String name;
    public Doctor(String name) {
        this.name = name;
    }


    public abstract void diagnose(Patient p);
}