package by.itstep.j1022.JB.programInterface;

import by.itstep.j1022.JB.function.MedicalInstitutionFunction;

public class Switcher {

    public static final String OPERATIONS = "\n" +
            "1 - Print medical institution \n" +
                    "2 - Total number of visitors \n" +
                    "3 - Medical institution with the least number of visitors \n" +
                    "4 - EXIT \n" +
                    "Enter operations: ";

    MedicalInstitutionFunction medicalInstitutionFunction = new MedicalInstitutionFunction();

    public boolean switcherOperation(int i) {
        switch (i) {
            case 1:
                medicalInstitutionFunction.medicalInstitution();
                break;
            case 2:
                medicalInstitutionFunction.totalNumberOfVisitors();
                break;
            case 3:
                medicalInstitutionFunction.medicalInstitutionWithTheLeastNumberOfVisitors();
                break;
            case 4:
                return false;
        }
        return true;
    }


}
