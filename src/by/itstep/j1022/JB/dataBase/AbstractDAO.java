package by.itstep.j1022.JB.dataBase;

import by.itstep.j1022.JB.view.ConsolePrinter;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public abstract class AbstractDAO {

    public String getPropertyValue(String propertyName) {
        String propertyValue = "";
        Properties properties = new Properties();

        try (InputStream inputStream = this.getClass().getResourceAsStream("../resources/connectToDb.properties")) {
            properties.load(inputStream);
            propertyValue = properties.getProperty(propertyName);
        } catch (IOException e) {
            System.out.println(e);
        }
        return propertyValue;
    }

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(getPropertyValue("DRIVER"));

            try {
                connection = DriverManager.getConnection(getPropertyValue("URL"),
                        getPropertyValue("USER"), getPropertyValue("PASSWORD"));

            } catch (SQLException e) {
                new ConsolePrinter().print(e + "");
            }

        } catch (ClassNotFoundException e) {
            new ConsolePrinter().print(e + "");
        }
        return connection;
    }

    public void releaseConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                new ConsolePrinter().print(e + "");
            }
        }
    }
}
