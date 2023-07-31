package by.itstep.j1022.JB.model.data;

public abstract class MedicalInstitution implements Comparable<MedicalInstitution> {

    private String name;
    private int amountOfVisitors;
    private int amountOfWorkers;
    private String workingHours;
    private Treatment typeOfTreatment;

    public MedicalInstitution() {
    }

    public MedicalInstitution(String name, int amountOfVisitors, int amountOfWorkers, String workingHours, Treatment typeOfTreatment) {
        this.name = name;
        this.amountOfVisitors = amountOfVisitors;
        this.amountOfWorkers = amountOfWorkers;
        this.workingHours = workingHours;
        this.typeOfTreatment = typeOfTreatment;
    }

    public MedicalInstitution(String name, int amountOfVisitors) {
        this.name = name;
        this.amountOfVisitors = amountOfVisitors;
    }

    public MedicalInstitution(String name, int amountOfVisitors, String workingHours) {
        this.name = name;
        this.amountOfVisitors = amountOfVisitors;
        this.workingHours = workingHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfVisitors() {
        return amountOfVisitors;
    }

    public void setAmountOfVisitors(int amountOfVisitors) {
        this.amountOfVisitors = amountOfVisitors;
    }

    public int getAmountOfWorkers() {
        return amountOfWorkers;
    }

    public void setAmountOfWorkers(int amountOfWorkers) {
        this.amountOfWorkers = amountOfWorkers;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public Treatment getTypeOfTreatment() {
        return typeOfTreatment;
    }

    public void setTypeOfTreatment(Treatment typeOfTreatment) {
        this.typeOfTreatment = typeOfTreatment;
    }

    @Override
    public String toString() {
        return "Type: " + getClass().getSimpleName() + "\n" +
                "Name: '" + name + '\'' + "\n" +
                "Visitors: " + amountOfVisitors + "\n" +
                "Workers: " + amountOfWorkers + "\n" +
                "Working hours: '" + workingHours + '\'' + "\n" +
                "Treatment: " + typeOfTreatment + "\n";
    }

    @Override
    public int compareTo(MedicalInstitution m) {
        return this.amountOfVisitors - m.amountOfVisitors;
    }
}
