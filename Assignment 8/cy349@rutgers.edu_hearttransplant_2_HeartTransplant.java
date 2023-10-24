
public class HeartTransplant {
 
    // patient array, each Patient is read from the data file
    private Patient[] patients;
 
    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge survivabilityByAge;
 
    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause survivabilityByCause;
 
    /*
     * Default constructor
     * Initializes patients to null.
     * Initializes survivabilityByAge to null.
     * Initializes survivabilityByCause to null.
     */
    public HeartTransplant() {
 
        this.patients = null;
        this.survivabilityByAge = null;
        this.survivabilityByCause = null;
    }
 
    /*
     * Returns patients
     */
    public Patient[] getPatients() {
        return this.patients;
        
     }
 
    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge getSurvivabilityByAge() {
        return this.survivabilityByAge;
        
    }
 
    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause getSurvivabilityByCause() {
        return this.survivabilityByCause;
        
    }
 
    /*
     * 1) Initialize the instance variable patients array with numberOfLines length.
     *
     * 2) Reads from the command line data file, use StdIn.readInt() to read an integer.
     *    File Format:
     *      ID, ethnicity, Gender, Age, Cause, Urgency, State of health
     *
     *    Each line refers to one Patient, all values are integers.
     *
     */
    public void readPatients (int numberOfLines) {
        Patient[] patients = new Patient[numberOfLines];
        for(int i = 0; i < numberOfLines; i ++)
        {
            int[] p = new int[7];
            for (int j = 0; j < 7; j ++)
            {
                String st = StdIn.readString();
                int num = Integer.parseInt(st);
                p[j] = num;
            }
           
            Patient patient = new Patient(p[0], p[1], p[2], p[3], p[4], p[5], p[6]);
            patients[i] = patient;
        }
        this.patients = patients;
      
    }
 
    /*
     * 1) Initialize the instance variable survivabilityByAge with a new survivabilityByAge object.
     *
     * 2) Reads from the command line file to populate the object.
     *    Use StdIn.readInt() to read an integer and StdIn.readDouble() to read a double.
     *
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     *
     */
    public void readSurvivabilityByAge (int numberOfLines) {
        SurvivabilityByAge s = new SurvivabilityByAge();
        for (int i = 0; i < numberOfLines; i++)
        {
            int num1 = StdIn.readInt();
            int num2 = StdIn.readInt();
            double num3 = StdIn.readDouble();
            s.addData(num1, num2, num3);
        }
 
        this.survivabilityByAge = s;
    }
 
    /*
     * 1) Initialize the instance variable survivabilityByCause with a new survivabilityByCause object.
     *
     * 2) Reads from the command line file to populate the object. Use StdIn.readInt() to read an
     *    integer and StdIn.readDouble() to read a double.
     *
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     *
     */
    public void readSurvivabilityByCause (int numberOfLines) {
        SurvivabilityByCause s = new SurvivabilityByCause();
        for (int i = 0; i < numberOfLines; i ++)
        {
            int num1 = StdIn.readInt();
            int num2 = StdIn.readInt();
            double num3 = StdIn.readDouble();
            s.addData(num1, num2, num3);
        }
        this.survivabilityByCause = s;
    }
   
    /*
     * Returns a Patient array containing the patients,
     * from the patients array, that have age above the parameter age.
     *
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with age above the parameter age.
     *
     * Return null if there is no Patient with age above the
     * parameter age.
     */
    public Patient[] getPatientsWithAgeAbove(int age) {
        int count = 0;
        for (int i = 0; i < this.patients.length; i ++)
        {
            if (this.patients[i].getAge() > age)
            {
                count += 1;
            }
        }
        if (count < 1)
        {
            return null;
        }
        int c = 0;
        Patient[] patients = new Patient[count];
        for (int i = 0; i < this.patients.length; i ++)
        {
            if (this.patients[i].getAge() > age)
            {
                patients[c] = this.patients[i];
                c ++;
            }
        }
        return patients;
    }
 
    /*
     * Returns a Patient array containing the patients, from the patients array,
     * that have the heart condition cause equal to the parameter cause.
     *
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the heart condition cause equal to the parameter cause.
     *
     * Return null if there is no Patient with the heart condition cause
     * equal to the parameter cause.
     */
    public Patient[] getPatientsByHeartConditionCause(int cause) {
        int count = 0;
        for (int i = 0; i < this.patients.length; i ++)
        {
            if (this.patients[i].getCause() == cause)
            {
                count += 1;
            }
        }
        if (count < 1)
        {
            return null;
        }
        Patient[] patients = new Patient[count];
        int c = 0;
        for (int i = 0; i < this.patients.length; i ++)
        {
            if (this.patients[i].getCause() == cause)
            {
                patients[c] = this.patients[i];
                c += 1;
            }
        }
        return patients;
        
       
    }
 
    /*
     * Returns a Patient array containing patients, from the patients array,
     * that have the state of health equal to the parameter state.
     *
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the state of health equal to the parameter state.
     *
     * Return null if there is no Patient with the state of health
     * equal to the parameter state.
     */
    public Patient[] getPatientsByUrgency(int urgency) {
        int count = 0;
        for (int i = 0; i < this.patients.length; i ++)
        {
            if (this.patients[i].getUrgency() == urgency)
            {
                count += 1;
            }
        }
        if (count < 1)
        {
            return null;
        }
        int c = 0;
        Patient[] patients = new Patient[count];
        for (int i = 0; i < this.patients.length; i ++)
        {
            if (this.patients[i].getUrgency() == urgency)
            {
                patients[c] = this.patients[i];
                c ++;
            }
        }
        return patients;
        
   
    }
 
    /*
     * Assume there is a heart available for transplantation surgery.
     * Also assume that the heart is of the same blood type as the
     * Patients on the patients array.
     * This method finds the Patient to be the recepient of this
     * heart.
     *
     * The method returns a Patient from the patients array with
     * he highest potential for survivability after the transplant.
     *
     * Assume the patient returned by this method will receive a heart,
     * therefore the Patient will no longer need a heart.
     *
     * There is no correct solution, you may come up with any
     * function to find the patient with the highest potential
     * for survivability after the transplant.
     */
    public Patient getPatientForTransplant () {
        double[] probabilities = new double[this.patients.length];
       
        for (int i = 0; i < this.patients.length; i ++)
        {
            int age = this.patients[i].getAge();
           
            int years = 5;
            int cause = this.patients[i].getCause();
 
            double a = this.survivabilityByAge.getRate(age, years);
            double b = this.survivabilityByCause.getRate(cause, years);
            double av = a + b / 2.0;
            probabilities[i] = av;
        }
        int highest = 0;
        
        for (int i = 0; i < this.patients.length; i ++)
        {
            if (this.patients[i].getNeedHeart() == true){
                if (probabilities[highest] < probabilities[i])
                {
                    highest = i;
                }
            }
        }
        this.patients[highest].setNeedHeart(false);
   
        return this.patients[highest];
    }
}