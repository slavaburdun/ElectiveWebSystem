package name.burdun.electivewebsystem.DAO;

import name.burdun.electivewebsystem.JdbcConnection.WrapperConnector;
import name.burdun.electivewebsystem.model.Professor;
import static name.burdun.electivewebsystem.DAO.SQLQueries.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by burdun on 26.09.2014.
 */
public class ProfessorDAO extends AbstractDAO {

    public ProfessorDAO() {
        this.connector = new WrapperConnector();
    }

    public List<Professor> findAll() {
        List<Professor> abonents = new ArrayList<>();
        Statement st = null;
        try {
            st = connector.getStatement();
            ResultSet resultSet =
                    st.executeQuery(FIND_ALL_PROFESSORS);
            while (resultSet.next()) {
                Professor professor = new Professor();
                professor.setID_Professor(resultSet.getInt("ID_Professor"));
                professor.setSurname(resultSet.getString("Surname"));
                abonents.add(professor);
            }
        } catch (SQLException e) {
            System.err.println("SQL exception (request or table failed): " + e);
        } finally {
            this.closeStatement(st);
        }
        return abonents;
    }

}