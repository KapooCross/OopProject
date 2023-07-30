package by.itstep.j1022.JB.dataBase;

import by.itstep.j1022.JB.model.data.*;
import by.itstep.j1022.JB.view.ConsolePrinter;
import by.itstep.j1022.JB.view.Printable;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class MedicalDAO extends AbstractDAO implements IAbstractDAO {

    Scanner scanner = new Scanner(System.in);
    Printable printer = new ConsolePrinter();

    @Override
    public void insert(Connection connection, List<MedicalInstitution> list) {
        try {
            PreparedStatement statement = connection.prepareStatement(getPropertyValue("SQL_INSERT_medical"));

            int var = 0;
            printer.print("Enter 1 of 3 types of medical institution \n" +
                    "1.Hospital \n" +
                    "2.Clinic \n" +
                    "3.MobileEmergencyDepartment" +
                    "enter a number: ");
            do {
                var = scanner.nextInt();
                switch (var) {
                    case 1:
                        statement.setObject(1, "Hospital");
                        break;
                    case 2:
                        statement.setString(1, "Clinic");
                        break;
                    case 3:
                        statement.setString(1, "MobileEmergencyDepartment");
                        break;
                    default:
                        printer.print("Invalid number. Try again..");
                }
            } while (var != 1 && var != 2 && var != 3);

            printer.print("Enter name of medical institution: ");
            statement.setString(2, scanner.next());

            printer.print("Enter visitors of medical institution: ");
            statement.setInt(3, scanner.nextInt());

            printer.print("Enter workers of medical institution: ");
            statement.setInt(4, scanner.nextInt());

            printer.print("Enter working hours of medical institution: ");
            statement.setString(5, scanner.next());

            printer.print("Enter 1 of 2 types treatment \n" +
                    "1.STATIONARY \n" +
                    "2.OUTPATIENT \n" +
                    "enter a number: ");

            do {
                var = scanner.nextInt();
                switch (var) {
                    case 1:
                        statement.setString(6, "STATIONARY");
                        break;
                    case 2:
                        statement.setString(6, "OUTPATIENT");
                        break;
                    default:
                        printer.print("Invalid number. Try again..");
                }
            } while (var != 1 && var != 2);

            statement.executeUpdate();

            printer.print("Medical institution successful add!");

            list.clear();
            select(connection, list);
            releaseConnection(connection);

        } catch (SQLException e) {
            new ConsolePrinter().print(e + "");
        }
    }

    @Override
    public ResultSet select(Connection connection, List<MedicalInstitution> list) {
        ResultSet table = null;
        try {
            Statement statement = connection.createStatement();
            table = statement.executeQuery(getPropertyValue("SQL_SELECT_medical"));

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
                throw new RuntimeException(e);
            }
        return table;
    }

    @Override
    public void delete(Connection connection, List<MedicalInstitution> list) {

        ResultSet table = null;
        try {
            Statement statement = connection.createStatement();


        } catch (SQLException e) {
            new ConsolePrinter().print(e + "");
        }
    }



//            statement.executeUpdate();
//            printer.print("Medical institution successful delete!");
//            list.clear();
//            select(connection, list);
//            releaseConnection(connection);

    }

