package by.itstep.j1022.JB.model.data;

public class Hospital extends MedicalInstitution{

    private boolean availabilityWards;
    private boolean availabilityReanimation;
    private boolean availabilityDiningRoom;
    private boolean performOperation;

    public Hospital() {
    }

    public Hospital(boolean availabilityWards, boolean availabilityReanimation, boolean availabilityDiningRoom, boolean performOperation) {
        this.availabilityWards = availabilityWards;
        this.availabilityReanimation = availabilityReanimation;
        this.availabilityDiningRoom = availabilityDiningRoom;
        this.performOperation = performOperation;
    }

    public Hospital(String name, int amountOfVisitors, int amountOfWorkers, String workingHours, Treatment typeOfTreatment, boolean availabilityWards, boolean availabilityReanimation, boolean availabilityDiningRoom, boolean performOperation) {
        super(name, amountOfVisitors, amountOfWorkers, workingHours, typeOfTreatment);
        this.availabilityWards = availabilityWards;
        this.availabilityReanimation = availabilityReanimation;
        this.availabilityDiningRoom = availabilityDiningRoom;
        this.performOperation = performOperation;
    }

    public Hospital(String name, int amountOfVisitors, boolean availabilityWards, boolean availabilityReanimation, boolean availabilityDiningRoom, boolean performOperation) {
        super(name, amountOfVisitors);
        this.availabilityWards = availabilityWards;
        this.availabilityReanimation = availabilityReanimation;
        this.availabilityDiningRoom = availabilityDiningRoom;
        this.performOperation = performOperation;
    }

    public Hospital(String name, int amountOfVisitors, String workingHours, boolean availabilityWards, boolean availabilityReanimation, boolean availabilityDiningRoom, boolean performOperation) {
        super(name, amountOfVisitors, workingHours);
        this.availabilityWards = availabilityWards;
        this.availabilityReanimation = availabilityReanimation;
        this.availabilityDiningRoom = availabilityDiningRoom;
        this.performOperation = performOperation;
    }

    public boolean getAvailabilityWards() {
        return availabilityWards;
    }

    public void setAvailabilityWards(boolean availabilityWards) {
        this.availabilityWards = availabilityWards;
    }

    public boolean getAvailabilityReanimation() {
        return availabilityReanimation;
    }

    public void setAvailabilityReanimation(boolean availabilityReanimation) {
        this.availabilityReanimation = availabilityReanimation;
    }

    public boolean getAvailabilityDiningRoom() {
        return availabilityDiningRoom;
    }

    public void setAvailabilityDiningRoom(boolean availabilityDiningRoom) {
        this.availabilityDiningRoom = availabilityDiningRoom;
    }

    public boolean getPerformOperation() {
        return performOperation;
    }

    public void setPerformOperation(boolean performOperation) {
        this.performOperation = performOperation;
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
                "Wards: " + availabilityWards + "\n" +
                "Reanimation: " + availabilityReanimation + "\n" +
                "Dining Room: " + availabilityDiningRoom + "\n" +
                "Perform Operation: " + performOperation + "\n";
    }
}

