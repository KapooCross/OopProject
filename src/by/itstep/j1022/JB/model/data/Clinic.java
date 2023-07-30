package by.itstep.j1022.JB.model.data;

public class Clinic extends MedicalInstitution {

    private boolean availabilityDoctorsAppointment;
    private boolean availabilityPhysicalTherapy;


    public Clinic() {
    }

    public Clinic(boolean availabilityDoctorsAppointment, boolean availabilityPhysicalTherapy) {
        this.availabilityDoctorsAppointment = availabilityDoctorsAppointment;
        this.availabilityPhysicalTherapy = availabilityPhysicalTherapy;
    }

    public Clinic(String name, int amountOfVisitors, int amountOfWorkers, String workingHours, Treatment typeOfTreatment, boolean availabilityDoctorsAppointment, boolean availabilityPhysicalTherapy) {
        super(name, amountOfVisitors, amountOfWorkers, workingHours, typeOfTreatment);
        this.availabilityDoctorsAppointment = availabilityDoctorsAppointment;
        this.availabilityPhysicalTherapy = availabilityPhysicalTherapy;
    }

    public Clinic(String name, int amountOfVisitors, boolean availabilityDoctorsAppointment, boolean availabilityPhysicalTherapy) {
        super(name, amountOfVisitors);
        this.availabilityDoctorsAppointment = availabilityDoctorsAppointment;
        this.availabilityPhysicalTherapy = availabilityPhysicalTherapy;
    }

    public Clinic(String name, int amountOfVisitors, String workingHours, boolean availabilityDoctorsAppointment, boolean availabilityPhysicalTherapy) {
        super(name, amountOfVisitors, workingHours);
        this.availabilityDoctorsAppointment = availabilityDoctorsAppointment;
        this.availabilityPhysicalTherapy = availabilityPhysicalTherapy;
    }

    public boolean getAvailabilityDoctorsAppointment() {
        return availabilityDoctorsAppointment;
    }

    public void setAvailabilityDoctorsAppointment(boolean availabilityDoctorsAppointment) {
        this.availabilityDoctorsAppointment = availabilityDoctorsAppointment;
    }

    public boolean getAvailabilityPhysicalTherapy() {
        return availabilityPhysicalTherapy;
    }

    public void setAvailabilityPhysicalTherapy(boolean availabilityPhysicalTherapy) {
        this.availabilityPhysicalTherapy = availabilityPhysicalTherapy;
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
                "DoctorsAppointment: " + availabilityDoctorsAppointment + "\n" +
                "PhysicalTherapy: " + availabilityPhysicalTherapy + "\n";
    }
}

