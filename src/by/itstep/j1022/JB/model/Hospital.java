package by.itstep.j1022.JB.model;

public class Hospital extends MedicalInstitution{

    {
        super.setWorkingHours("24/7");
    }

    public Hospital() {
    }

    public Hospital(String name, int amountOfVisitors, int amountOfWorkers) {
        super("Hospital: " +name, amountOfVisitors, amountOfWorkers);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
