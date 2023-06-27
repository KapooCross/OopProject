package by.itstep.j1022.JB.model;

public abstract class MedicalInstitution {
    private String name;
    private int amountOfVisitors;
    private int amountOfWorkers;
    private String workingHours;

    public MedicalInstitution() {
    }

    public MedicalInstitution(String name, int amountOfVisitors, int amountOfWorkers) {
        this.name = name;
        this.amountOfVisitors = amountOfVisitors;
        this.amountOfWorkers = amountOfWorkers;
    }


    public int getAmountOfVisitors() {
        return amountOfVisitors;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "Name = '" + name + '\'' +
                ", Visitors = " + amountOfVisitors +
                ", Workers = " + amountOfWorkers +
                ", Working hours = '" + workingHours + '\'';
    }
}
