package pe.edu.utp.cuentahistorias.actions;

import pe.edu.utp.cuentahistorias.models.*;
import pe.edu.utp.cuentahistorias.services.CHService;

import java.sql.Date;

/**
 * Created by usuario on 15/07/2017.
 */
public class UserAction {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Date subscriptionStart;
    private Date subscriptionRenovation;
    private Subscription subscription;
    private Enterprise enterprise;
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getSubscriptionStart() {
        return subscriptionStart;
    }

    public void setSubscriptionStart(Date subscriptionStart) {
        this.subscriptionStart = subscriptionStart;
    }

    public Date getSubscriptionRenovation() {
        return subscriptionRenovation;
    }

    public void setSubscriptionRenovation(Date subscriptionRenovation) {
        this.subscriptionRenovation = subscriptionRenovation;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String login(){
        try {
            CHService service = new CHService();
            user = service.getUsersByEmail(email, password);
            id = user.getId();
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "input";
        }
    }

    public String execute(){
            return "success";
    }

}
