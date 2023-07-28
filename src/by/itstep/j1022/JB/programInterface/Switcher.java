package by.itstep.j1022.JB.programInterface;

import by.itstep.j1022.JB.model.data.MedicalInstitution;
import by.itstep.j1022.JB.model.view.Print;
import by.itstep.j1022.JB.model.view.Printer;

import java.util.List;

import static by.itstep.j1022.JB.model.logic.MedicalManager.*;

public class Switcher {

    public static final String OPERATIONS = "\n" +
            "1 - Print medical institution \n" +
            "2 - Total number of visitors \n" +
            "3 - Medical institution with the least number of visitors \n" +
            "4 - Sorting by number of visitors \n" +
            "5 - EXIT \n" +
            "Enter operations: ";
    Printer printer = new Print();

    public boolean switcherOperation(int i, List<MedicalInstitution> list) {
        switch (i) {
            case 1:
                printer.printToConsole(medicalInstitution(list));
                break;
            case 2:
                printer.printToConsole(totalNumberOfVisitors(list));
                break;
            case 3:
                printer.printToConsole(medicalInstitutionWithTheLeastNumberOfVisitors(list));
                break;
            case 4:
                printer.printToConsole(sortingByNumberOfVisitors(list));
                break;
            case 5:
                return false;
        }
        return true;
    }


}
