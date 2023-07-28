package by.itstep.j1022.JB.controller;

import by.itstep.j1022.JB.DataBase.OperationDb;
import by.itstep.j1022.JB.model.data.MedicalInstitution;
import by.itstep.j1022.JB.programInterface.Switcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

//    public static List<MedicalInstitution> medicalList = new ArrayList<>(Arrays.asList(
//            new Hospital("Klimpton", 456, true, true, true, true),
//            new Hospital("Hipos", 1200,true, true, true, true),
//            new Hospital("Nordon", 625,true, true, true, true),
//            new Hospital("Felix", 340,true, true, true, true),
//            new Clinic("Jersy", 245, "9:00 - 17:00",true, true),
//            new Clinic("Liops", 550,  "9:00 - 17:00",true, true),
//            new Clinic("Factor", 715,  "9:00 - 17:00",true, true),
//            new Clinic("Reberry", 510,  "9:00 - 17:00",true, true),
//            new MobileEmergencyDepartment("Rochester", 5, true, true),
//            new MobileEmergencyDepartment("Klivlend", 7, true, true),
//            new MobileEmergencyDepartment("Baltimor", 3, true, true),
//            new MobileEmergencyDepartment("Boston", 12, true, true)));
    public static void main(String[] args) {

        List<MedicalInstitution> medicalList = new ArrayList<>();

        OperationDb connectToDb = new OperationDb();
        connectToDb.selectToDb(medicalList);

        Switcher switcher = new Switcher();
        while (true) {
            System.out.println(switcher.OPERATIONS);
            boolean operation = switcher.switcherOperation(enterVariable(), medicalList);
            if (!operation) {
                System.out.println("BYE");
                break;
            }
        }

    }

    public static Integer enterVariable() {
        return new Scanner(System.in).nextInt();
    }
}











