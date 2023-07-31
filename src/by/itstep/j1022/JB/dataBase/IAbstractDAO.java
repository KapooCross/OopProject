package by.itstep.j1022.JB.dataBase;

import by.itstep.j1022.JB.model.data.MedicalInstitution;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

public interface IAbstractDAO {
     void insert(Connection connection, List<MedicalInstitution> list);
     ResultSet select(Connection connection, List<MedicalInstitution> list);

     void delete(Connection connection, List<MedicalInstitution> list);
}
