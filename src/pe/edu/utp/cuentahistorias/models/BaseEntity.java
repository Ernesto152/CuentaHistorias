package pe.edu.utp.cuentahistorias.models;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by usuario on 17/06/2017.
 */
public class BaseEntity {
    private Connection connection;
    private static String BASE_QUERY = " SELECT * FROM ";
    private String tableName;

    public BaseEntity(Connection connection, String tableName) {
        this.setConnection(connection);
        this.setTableName(tableName);
    }

    public BaseEntity() {
    }

    public Connection getConnection() {
        return connection;
    }

    public BaseEntity setConnection(Connection connection) {
        this.connection = connection;
        return this;
    }

    public String getTableName() {
        return tableName;
    }

    public BaseEntity setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public String getDefaultQuery(){
        return BASE_QUERY + getTableName();
    }

    public boolean change(String sql){
        try {
            int result = getConnection().createStatement().executeUpdate(sql);
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
