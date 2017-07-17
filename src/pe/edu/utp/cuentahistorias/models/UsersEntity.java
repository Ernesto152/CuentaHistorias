package pe.edu.utp.cuentahistorias.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by usuario on 17/06/2017.
 */
public class UsersEntity extends BaseEntity {

    public UsersEntity(Connection connection) {
        super(connection, "users");
    }

    public UsersEntity() {
        super();
    }

    List<User> findAll(SubscriptionsEntity subscriptionsEntity, EnterprisesEntity enterprisesEntity){
        return findByCriteria("", subscriptionsEntity, enterprisesEntity);
    }

    public User findById(int id, SubscriptionsEntity subscriptionsEntity, EnterprisesEntity enterprisesEntity){
        String criteria = " id = " + id;
        return findByCriteria(criteria, subscriptionsEntity, enterprisesEntity).get(0);
    }

    public User findByFirstName(String firstName, SubscriptionsEntity subscriptionsEntity, EnterprisesEntity enterprisesEntity){
        String criteria = " first_name = '" + firstName + "'";
        return findByCriteria(criteria, subscriptionsEntity, enterprisesEntity).get(0);
    }

    public User findByLastName(String lastName, SubscriptionsEntity subscriptionsEntity, EnterprisesEntity enterprisesEntity){
        String criteria = " last_name = '" + lastName + "'";
        return findByCriteria(criteria, subscriptionsEntity, enterprisesEntity).get(0);
    }

    public User findByEmail(String email, SubscriptionsEntity subscriptionsEntity, EnterprisesEntity enterprisesEntity){
        String criteria = " email = '" + email + "'";
        return findByCriteria(criteria, subscriptionsEntity, enterprisesEntity).get(0);
    }

    public User validate(String email, SubscriptionsEntity subscriptionsEntity, EnterprisesEntity enterprisesEntity){
        String sql = "SELECT password FROM users WHERE email = '" + email + "'";
        return null;
    }

    public List<User> findByCriteria(String criteria, SubscriptionsEntity subscriptionsEntity, EnterprisesEntity enterprisesEntity){
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<User> users = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection().createStatement().executeQuery(sql);
            if (resultSet == null) return null;
            while (resultSet.next()){
                users.add(User.build(resultSet, subscriptionsEntity, enterprisesEntity));
            }
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /*
    public boolean add(User user){
        String sql = "INSERT INTO users(id, first_name, last_name, email, password, subscription_start, subscription_renovation, subscription_id, enterprise_id)" +
                " VALUES(" +
                    user.getIdAsString() + ", " +
                    user.getFirstNameAsValue() + ", " +
                    user.getLastNameAsValue() + ", " +
                    user.getEmailAsValue() + ", " +
                    user.getPasswordAsValue() + ", " +
                    user.getSubscriptionStartAsValue() + ", " +
                    user.getSubscriptionRenovationAsValue() + ", " +
                    user.getSubscription().getIdAsString() + ", " +
                    user.getEnterprise().getIdAsString() + ")";
        return change(sql);
    }
     */

    public boolean add(User user){
        String sql = "INSERT INTO users(first_name, last_name, email, password, subscription_start, " +
                "subscription_renovation, subscription_id, enterprise_id)" +
                " VALUES(" +
                    user.getFirstNameAsValue() + ", " +
                    user.getLastNameAsValue() + ", " +
                    user.getEmailAsValue() + ", " +
                    user.getPasswordAsValue() + ", " +
                    "CURDATE(), " +
                    "DATE_ADD(CURDATE(), INTERVAL 180 DAY), " +
                    "1, " +
                    "NULL)";
        return change(sql);
    }


    /*
    INSERT INTO
    users(first_name, last_name, email, password, subscription_start, subscription_renovation, subscription_id, enterprise_id)
    VALUES('Sheyla', 'Berrocal', 'sheylaberrocal@gmail.com', '12345', CURDATE(), DATE_ADD(CURDATE(), INTERVAL 180 DAY), 1, NULL)
     */
}
