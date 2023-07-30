package by.itstep.j1022.JB.controller;

import by.itstep.j1022.JB.dataBase.MedicalDAO;
import by.itstep.j1022.JB.model.data.MedicalInstitution;
import by.itstep.j1022.JB.programInterface.Switcher;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static by.itstep.j1022.JB.programInterface.Switcher.enterVariable;

public class Main {

    public static void main(String[] args) {

       MedicalDAO dataBase = new MedicalDAO();
        List<MedicalInstitution> medicalList = new ArrayList<>();
        Connection connection = dataBase.getConnection();
        dataBase.select(connection, medicalList);
        dataBase.releaseConnection(connection);


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
}











