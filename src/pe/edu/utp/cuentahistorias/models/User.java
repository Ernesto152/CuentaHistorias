package pe.edu.utp.cuentahistorias.models;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by usuario on 17/06/2017.
 */
public class    User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Date subscriptionStart;
    private Date subscriptionRenovation;
    private Subscription subscription;
    private Enterprise enterprise;

    public User(int id, String firstName, String lastName, String email, String password, Date subscriptionStart, Date subscriptionRenovation, Subscription subscription, Enterprise enterprise) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.subscriptionStart = subscriptionStart;
        this.subscriptionRenovation = subscriptionRenovation;
        this.subscription = subscription;
        this.enterprise = enterprise;
    }

    public User() {
    }


    public int getId() {
        return id;
    }

    public String getIdAsString(){
        return String.valueOf(getId());
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFirstNameAsValue(){
        return "'" + getFirstName() + "'";
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLastNameAsValue(){
        return "'" + getLastName() + "'";
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public String getEmailAsValue(){
        return "'" + getEmail() + "'";
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordAsValue(){
        return "'" + getPassword() + "'";
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Date getSubscriptionStart() {
        return subscriptionStart;
    }

    public String getSubscriptionStartAsValue(){
        return "'" + getSubscriptionStart() + "'";
    }

    public User setSubscriptionStart(Date subscriptionStart) {
        this.subscriptionStart = subscriptionStart;
        return this;
    }

    public Date getSubscriptionRenovation() {
        return subscriptionRenovation;
    }

    public String getSubscriptionRenovationAsValue(){
        return "'" + getSubscriptionRenovation() + "'";
    }

    public User setSubscriptionRenovation(Date subscriptionRenovation) {
        this.subscriptionRenovation = subscriptionRenovation;
        return this;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public String getSubscriptionAsString(){
        return String.valueOf(getSubscription());
    }

    public User setSubscription(Subscription subscription) {
        this.subscription = subscription;
        return this;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public String getEnterpriseAsString(){
        return String.valueOf(getEnterprise());
    }

    public User setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
        return this;
    }

    public static User build(ResultSet resultSet, SubscriptionsEntity subscriptionsEntity, EnterprisesEntity enterprisesEntity){
        try {
            return (new User())
                    .setId(resultSet.getInt("id"))
                    .setFirstName(resultSet.getString("first_name"))
                    .setLastName(resultSet.getString("last_name"))
                    .setEmail(resultSet.getString("email"))
                    .setPassword(resultSet.getString("password"))
                    .setSubscriptionStart(resultSet.getDate("subscription_start"))
                    .setSubscriptionRenovation(resultSet.getDate("subscription_renovation"))
                    .setSubscription(subscriptionsEntity.findById(resultSet.getInt("subscriptions")))
                    .setEnterprise(enterprisesEntity.findById(resultSet.getInt("enterprise_id"), subscriptionsEntity));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
