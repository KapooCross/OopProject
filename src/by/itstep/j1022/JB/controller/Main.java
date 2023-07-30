package by.itstep.j1022.JB.controller;

import by.itstep.j1022.JB.dataBase.OperationDb;
import by.itstep.j1022.JB.model.data.MedicalInstitution;
import by.itstep.j1022.JB.programInterface.Switcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
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











