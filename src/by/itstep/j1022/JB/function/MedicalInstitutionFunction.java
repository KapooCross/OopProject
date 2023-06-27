package by.itstep.j1022.JB.function;

import by.itstep.j1022.JB.array.ArrayOfMedicalInstitution;
import by.itstep.j1022.JB.model.MedicalInstitution;

public class MedicalInstitutionFunction {
    ArrayOfMedicalInstitution arrayOfMedicalInstitution = new ArrayOfMedicalInstitution();

    public void medicalInstitution() {

        if (arrayOfMedicalInstitution.medicalInstitutionsArray.length < 1){
            printToConsole("There are no medical institutions in the database.");
            return;
        }

        for (MedicalInstitution medicalInstitution : arrayOfMedicalInstitution.medicalInstitutionsArray) {
//            System.out.println(medicalInstitution.toString());
            printToConsole(medicalInstitution.toString());
        }
    }

    public void totalNumberOfVisitors() {

        if (arrayOfMedicalInstitution.medicalInstitutionsArray.length < 1){
            printToConsole("There are no medical institutions in the database.");
            return;
        }

        int totalNumberOfVisitors = 0;
        for (MedicalInstitution medicalInstitution : arrayOfMedicalInstitution.medicalInstitutionsArray) {
            totalNumberOfVisitors += medicalInstitution.getAmountOfVisitors();
        }
//        System.out.println("Total number of visitors: " + totalNumberOfVisitors);
        printToConsole("Total number of visitors: " + totalNumberOfVisitors);
    }

    public void medicalInstitutionWithTheLeastNumberOfVisitors(){


        if (arrayOfMedicalInstitution.medicalInstitutionsArray.length < 1){
            printToConsole("There are no medical institutions in the database.");
            return;
        }

        int minNumberOfVisitors = arrayOfMedicalInstitution.medicalInstitutionsArray[0].getAmountOfVisitors();
        for (int i = 1; i < arrayOfMedicalInstitution.medicalInstitutionsArray.length; i++) {
            if (minNumberOfVisitors > arrayOfMedicalInstitution.medicalInstitutionsArray[i].getAmountOfVisitors()) {
                minNumberOfVisitors = arrayOfMedicalInstitution.medicalInstitutionsArray[i].getAmountOfVisitors();
            }
        }
//        System.out.println(minNumberOfVisitors);
        printToConsole(minNumberOfVisitors + "");
    }

    public void printToConsole(String s){
        System.out.println(s);
    }

}
