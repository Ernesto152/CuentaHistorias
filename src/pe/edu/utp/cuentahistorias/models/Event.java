package pe.edu.utp.cuentahistorias.models;

import java.sql.Date;

/**
 * Created by usuario on 13/07/2017.
 */
public class Event {
    private int id;
    private String title;
    private Date creationDate;
    private Enterprise enterprise;

    public Event(int id, String title, Date creationDate, Enterprise enterprise) {
        this.id = id;
        this.title = title;
        this.creationDate = creationDate;
        this.enterprise = enterprise;
    }

    public Event() {
    }

    public int getId() {
        return id;
    }

    public Event setId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Event setTitle(String title) {
        this.title = title;
        return this;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Event setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public Event setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
        return this;
    }
}
