package pe.edu.utp.cuentahistorias.models;

import java.awt.*;
import java.util.Date;

/**
 * Created by will on 17/06/2017.
 */
public class History {
    private int id;
    private String title;
    private Date piblicationDate;
    private String description;
    private Image image;
    private Subscription subscription;
    private String link;
    private String like;
    private String dislike;

    public History() {
    }

    public History(int id, String title, Date piblicationDate, String description, Image image, Subscription subscription, String link, String like, String dislike) {
        this.setId(id);
        this.setTitle(title);
        this.setPiblicationDate(piblicationDate);
        this.setDescription(description);
        this.setImage(image);
        this.setSubscription(subscription);
        this.setLink(link);
        this.setLike(like);
        this.setDislike(dislike);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPiblicationDate() {
        return piblicationDate;
    }

    public void setPiblicationDate(Date piblicationDate) {
        this.piblicationDate = piblicationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getDislike() {
        return dislike;
    }

    public void setDislike(String dislike) {
        this.dislike = dislike;
    }
}
