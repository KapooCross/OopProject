package by.itstep.j1022.JB.model.data;

public enum Treatment {
    OUTPATIENT("Outpatient"), STATIONARY("Stationary");

    private String name;

    Treatment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
