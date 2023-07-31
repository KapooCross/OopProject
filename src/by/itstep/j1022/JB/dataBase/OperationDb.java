package by.itstep.j1022.JB.dataBase;

import by.itstep.j1022.JB.model.data.*;
import by.itstep.j1022.JB.view.ConsolePrinter;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.List;
import java.util.Properties;

public class OperationDb {

    public String getPropertyValue(String propertyName){
        String propertyValue = "";
        Properties properties = new Properties();

        try(InputStream inputStream = this.getClass().getResourceAsStream("../resources/connectToDb.properties")) {
            properties.load(inputStream);
            propertyValue = properties.getProperty(propertyName);
        } catch (IOException e) {
            System.out.println(e);
        }
        return propertyValue;
    }

    public void selectToDb(List<MedicalInstitution> list) {

        try {
            Class.forName(getPropertyValue("DRIVER"));

            try (Connection connection = DriverManager.getConnection(getPropertyValue("URL"), getPropertyValue("USER"), getPropertyValue("PASSWORD"));
                 Statement statement = connection.createStatement();
                 ResultSet table = statement.executeQuery(getPropertyValue("SQL_SELECT_medical"))) {

                while (table.next()) {
                    if (table.getString("type").contains("Hospital")) {
                        Hospital hospital = new Hospital();
                        hospital.setName(table.getString("name"));
                        hospital.setAmountOfVisitors(table.getInt("visitors"));
                        hospital.setAmountOfWorkers(table.getInt("workers"));
                        hospital.setWorkingHours(table.getString("working_hours"));
                        hospital.setTypeOfTreatment(Treatment.valueOf(table.getString("treatment")));
                        hospital.setAvailabilityWards(table.getBoolean("wards"));
                        hospital.setAvailabilityReanimation(table.getBoolean("reanimation"));
                        hospital.setAvailabilityDiningRoom(table.getBoolean("dining_room"));
                        hospital.setPerformOperation(table.getBoolean("perform_operation"));

                        list.add(hospital);
                    }
                    if (table.getString("type").contains("Clinic")) {
                        Clinic clinic = new Clinic();
                        clinic.setName(table.getString("name"));
                        clinic.setAmountOfVisitors(table.getInt("visitors"));
                        clinic.setAmountOfWorkers(table.getInt("workers"));
                        clinic.setWorkingHours(table.getString("working_hours"));
                        clinic.setTypeOfTreatment(Treatment.valueOf(table.getString("treatment")));
                        clinic.setAvailabilityDoctorsAppointment(table.getBoolean("doctors_appointment"));
                        clinic.setAvailabilityPhysicalTherapy(table.getBoolean("physical_therapy"));

                        list.add(clinic);
                    }
                    if (table.getString("type").contains("MobileEmergencyDepartment")) {
                        MobileEmergencyDepartment department = new MobileEmergencyDepartment();
                        department.setName(table.getString("name"));
                        department.setAmountOfVisitors(table.getInt("visitors"));
                        department.setAmountOfWorkers(table.getInt("workers"));
                        department.setWorkingHours(table.getString("working_hours"));
                        department.setTypeOfTreatment(Treatment.valueOf(table.getString("treatment")));
                        department.setMobile(table.getBoolean("mobile"));
                        department.setAvailabilityCar(table.getBoolean("car"));

                        list.add(department);
                    }

                }
            } catch (SQLException e) {
                new ConsolePrinter().print(e + "");
            }

        } catch (ClassNotFoundException e) {
            new ConsolePrinter().print(e + "");
        }
    }
}
