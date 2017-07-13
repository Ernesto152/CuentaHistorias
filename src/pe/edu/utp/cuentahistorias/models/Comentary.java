package pe.edu.utp.cuentahistorias.models;

/**
 * Created by will on 17/06/2017.
 */
public class Comentary {
    private String description;
    private Subscription subscription;

    public Comentary() {
    }

    public Comentary(String description, Subscription subscription) {
        this.setDescription(description);
        this.setSubscription(subscription);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }
}