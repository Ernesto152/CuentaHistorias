package pe.edu.utp.cuentahistorias.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by usuario on 13/07/2017.
 */
public class Enterprise {
    private int id;
    private String name;
    private int ruc;
    private String category;
    private Subscription subscription;

    public Enterprise(int id, String name, int ruc, String category, Subscription subscription) {
        this.id = id;
        this.name = name;
        this.ruc = ruc;
        this.category = category;
        this.subscription = subscription;
    }

    public Enterprise() {
    }

    public int getId() {
        return id;
    }

    public String getIdAsString(){
        return String.valueOf(getId());
    }

    public Enterprise setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getNameAsValue(){
        return "'" + getName() + "'";
    }

    public Enterprise setName(String name) {
        this.name = name;
        return this;
    }

    public int getRuc() {
        return ruc;
    }

    public String getRucAsString(){
        return String.valueOf(getRuc());
    }

    public Enterprise setRuc(int ruc) {
        this.ruc = ruc;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public String getCategoryAsValue(){
        return "'" + getCategory() + "'";
    }

    public Enterprise setCategory(String category) {
        this.category = category;
        return this;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public String getSubscriptionAsString(){
        return String.valueOf(getSubscription());
    }

    public Enterprise setSubscription(Subscription subscription) {
        this.subscription = subscription;
        return this;
    }

    public static Enterprise build(ResultSet resultSet, SubscriptionsEntity subscriptionsEntity){
        try {
            return (new Enterprise())
                    .setId(resultSet.getInt("id"))
                    .setName(resultSet.getString("name"))
                    .setRuc(resultSet.getInt("ruc"))
                    .setCategory(resultSet.getString("category"))
                    .setSubscription(subscriptionsEntity.findById(resultSet.getInt("subscription_id")));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
