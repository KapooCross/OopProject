package by.itstep.j1022.JB.model;

public class Clinic extends MedicalInstitution {


    {
        super.setWorkingHours("08:00 - 20:00");
    }

    public Clinic() {
    }

    public Clinic(String name, int amountOfVisitors, int amountOfWorkers) {
        super("Clinic: " + name, amountOfVisitors, amountOfWorkers);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

