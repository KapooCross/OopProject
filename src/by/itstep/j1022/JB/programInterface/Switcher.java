package by.itstep.j1022.JB.programInterface;

import by.itstep.j1022.JB.model.data.MedicalInstitution;
import by.itstep.j1022.JB.view.ConsolePrinter;
import by.itstep.j1022.JB.view.Printable;

import java.util.List;

import static by.itstep.j1022.JB.model.logic.MedicalManager.*;

public class Switcher {

    public static final String OPERATIONS = "\n" +
            "1 - Print all medical institution \n" +
            "2 - Total number of visitors \n" +
            "3 - Medical institution with the least number of visitors \n" +
            "4 - Sorting by number of visitors \n" +
            "5 - EXIT \n" +
            "Enter operations: ";
    Printable printer = new ConsolePrinter();

    public boolean switcherOperation(int i, List<MedicalInstitution> list) {
        switch (i) {
            case 1:
                printer.print(medicalInstitution(list));
                break;
            case 2:
                printer.print(totalNumberOfVisitors(list));
                break;
            case 3:
                printer.print(medicalInstitutionWithTheLeastNumberOfVisitors(list));
                break;
            case 4:
                printer.print(sortingByNumberOfVisitors(list));
                break;
            case 5:
                return false;
        }
        return true;
    }


}
