package pe.edu.utp.cuentahistorias.models;

/**
 * Created by will on 17/06/2017.
 */
public class Competetition {
    private int id;
    private Subscription subscription;

    public Competetition() {
    }

    public Competetition(int id, Subscription subscription) {
        this.setId(id);
        this.setSubscription(subscription);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }
}

