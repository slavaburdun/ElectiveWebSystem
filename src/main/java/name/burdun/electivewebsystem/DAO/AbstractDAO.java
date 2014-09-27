package name.burdun.electivewebsystem.DAO;

import name.burdun.electivewebsystem.JdbcConnection.WrapperConnector;

import java.sql.Statement;

/**
 * Created by burdun on 26.09.2014.
 */
public abstract class AbstractDAO {

    protected WrapperConnector connector;

    /*
    public abstract List<T> findAll();
    public abstract T findEntityById(int id);
    public abstract boolean delete(int id);
    public abstract boolean delete(T entity);
    public abstract boolean create(T entity);
    public abstract T update(T entity);
    */

    protected void closeStatement(Statement statement) {
        connector.closeStatement(statement);
    }

    public void closeConnection() {
        connector.closeConnection();
    }
}