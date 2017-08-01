package pe.edu.utp.cuentahistorias.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by usuario on 16/06/2017.
 */
public class SubscriptionsEntity extends BaseEntity {

    public SubscriptionsEntity(Connection connection) {
        super(connection, "subscriptions");
    }

    public SubscriptionsEntity() {
    }

    List<Subscription> findAll(){
        return findByCriteria("");
    }

    public Subscription findById(int id){
        String criteria = " id = " + String.valueOf(id);
        return findByCriteria(criteria).get(0);
    }

    public Subscription findByName(String name){
        String criteria = " name = '" + name + "'";
        return findByCriteria(criteria).get(0);
    }

    public List<Subscription> findByCriteria(String criteria){
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Subscription> subscriptions = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection().createStatement().executeQuery(sql);
            if (resultSet == null) return null;
            while (resultSet.next()){
                subscriptions.add(Subscription.build(resultSet));
            }
            return subscriptions;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
