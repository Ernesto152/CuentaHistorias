package pe.edu.utp.cuentahistorias.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by usuario on 14/07/2017.
 */
public class EnterprisesEntity extends BaseEntity {

    public EnterprisesEntity(Connection connection) {
        super(connection, "enterprises");
    }

    public EnterprisesEntity() {
    }

    List<Enterprise> findAll(SubscriptionsEntity subscriptionsEntity){
        return findByCriteria("", subscriptionsEntity);
    }

    public Enterprise findById(int id, SubscriptionsEntity subscriptionsEntity){
        String criteria = " id = " + String.valueOf(id);
        return findByCriteria(criteria, subscriptionsEntity).get(0);
    }

    public List<Enterprise> findByCriteria(String criteria, SubscriptionsEntity subscriptionsEntity){
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Enterprise> enterprises = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection().createStatement().executeQuery(sql);
            if (resultSet == null) return null;
            while (resultSet.next()){
                enterprises.add(Enterprise.build(resultSet, subscriptionsEntity));
            }
            return enterprises;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return enterprises;
    }
}
