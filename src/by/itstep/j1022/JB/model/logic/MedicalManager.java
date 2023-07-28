package by.itstep.j1022.JB.model.logic;

import by.itstep.j1022.JB.model.data.MedicalInstitution;

import java.util.List;
import java.util.stream.Collectors;


public class MedicalManager {

    public static String medicalInstitution(List<MedicalInstitution> list) {
        if (list.size() < 1) {
            return "There are no medical institutions in the database.";
        }

        String message = "";

        for (MedicalInstitution medicalInstitution : list) {
            message += medicalInstitution.toString() + "\n";
        }
        return message;
    }

    public static String totalNumberOfVisitors(List<MedicalInstitution> list) {

        if (list.size() < 1) {
            return "There are no medical institutions in the database.";
        }

        int totalNumberOfVisitors = 0;
        for (MedicalInstitution medicalInstitution : list) {
            totalNumberOfVisitors += medicalInstitution.getAmountOfVisitors();
        }
        return ("Total number of visitors: " + totalNumberOfVisitors);
    }

    public static String medicalInstitutionWithTheLeastNumberOfVisitors(List<MedicalInstitution> list) {


        if (list.size() < 1) {
            return "There are no medical institutions in the database.";
        }

        int minNumberOfVisitors = list.get(0).getAmountOfVisitors();
        for (int i = 1; i < list.size(); i++) {
            if (minNumberOfVisitors > list.get(i).getAmountOfVisitors()) {
                minNumberOfVisitors = list.get(i).getAmountOfVisitors();
            }
        }
        return minNumberOfVisitors + "";
    }

    public static String sortingByNumberOfVisitors(List<MedicalInstitution> list) {


        if (list.size() < 1) {
            return "There are no medical institutions in the database.";
        }

        String message = "";
        List<MedicalInstitution> listSorting = list.stream().collect(Collectors.toList());
        listSorting.sort(MedicalInstitution::compareTo);

        for (MedicalInstitution m : listSorting) {
            message += m.toString() + "\n";
        }

        return message;
    }

}
