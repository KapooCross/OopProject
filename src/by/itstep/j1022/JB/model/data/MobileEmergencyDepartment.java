package by.itstep.j1022.JB.model.data;

public class MobileEmergencyDepartment extends MedicalInstitution{
    private boolean mobile;
    private boolean availabilityCar;

    public MobileEmergencyDepartment() {
    }

    public MobileEmergencyDepartment(boolean mobile, boolean availabilityCar) {
        this.mobile = mobile;
        this.availabilityCar = availabilityCar;
    }

    public MobileEmergencyDepartment(String name, int amountOfVisitors, int amountOfWorkers, String workingHours, Treatment typeOfTreatment, boolean mobile, boolean availabilityCar) {
        super(name, amountOfVisitors, amountOfWorkers, workingHours, typeOfTreatment);
        this.mobile = mobile;
        this.availabilityCar = availabilityCar;
    }

    public MobileEmergencyDepartment(String name, int amountOfVisitors, boolean mobile, boolean availabilityCar) {
        super(name, amountOfVisitors);
        this.mobile = mobile;
        this.availabilityCar = availabilityCar;
    }

    public MobileEmergencyDepartment(String name, int amountOfVisitors, String workingHours, boolean mobile, boolean availabilityCar) {
        super(name, amountOfVisitors, workingHours);
        this.mobile = mobile;
        this.availabilityCar = availabilityCar;
    }

    public boolean getMobile() {
        return mobile;
    }

    public void setMobile(boolean mobile) {
        this.mobile = mobile;
    }

    public boolean getAvailabilityCar() {
        return availabilityCar;
    }

    public void setAvailabilityCar(boolean availabilityCar) {
        this.availabilityCar = availabilityCar;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAmountOfVisitors() {
        return super.getAmountOfVisitors();
    }

    @Override
    public void setAmountOfVisitors(int amountOfVisitors) {
        super.setAmountOfVisitors(amountOfVisitors);
    }

    @Override
    public int getAmountOfWorkers() {
        return super.getAmountOfWorkers();
    }

    @Override
    public void setAmountOfWorkers(int amountOfWorkers) {
        super.setAmountOfWorkers(amountOfWorkers);
    }

    @Override
    public String getWorkingHours() {
        return super.getWorkingHours();
    }

    @Override
    public void setWorkingHours(String workingHours) {
        super.setWorkingHours(workingHours);
    }

    @Override
    public Treatment getTypeOfTreatment() {
        return super.getTypeOfTreatment();
    }

    @Override
    public void setTypeOfTreatment(Treatment typeOfTreatment) {
        super.setTypeOfTreatment(typeOfTreatment);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Mobile: " + mobile + "\n" +
                "Availability car: " + availabilityCar + "\n";
    }
}
