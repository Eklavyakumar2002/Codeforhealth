package Day4_Healthcaree;


public class PatientServiceImpl implements PatientService {

    private Patient[] patients = new Patient[10];
    private int count = 0;

    public void registerPatient(Patient p) {
        if (count < patients.length) {
            patients[count] = p;
            count++;
            System.out.println("Patient Registered: " + p.getName());
        } else {
            System.out.println("Storage full!");
        }
    }


    public void showPatients() {
        System.out.println("\n--- Patient List ---");
        for (int i = 0; i < count; i++) {
            System.out.println("ID: " + patients[i].getId());
            System.out.println("Name: " + patients[i].getName());
            System.out.println("Age: " + patients[i].getAge());
            System.out.println("Illness: " + patients[i].getIllness());
            System.out.println();
        }
    }

    public int getCount() {
        return count;
    }

    public Patient getPatientAt(int index) {
        return patients[index];
    }
}