package pe.edu.utp.cuentahistorias.models;

import java.awt.*;

/**
 * Created by will on 17/06/2017.
 */

public class History {
    private int id;
    private String title;
    private String publicationstate;
    private String description;
    private Image image;
    private String subscription;
    private String link;
    private String like;
    private String dislike;

    public History() {
    }

    public History(int id, String title, String publicationstate, String description, Image image, String link, String like, String dislike, String subscription) {

        this.setId(id);
        this.setTitle(title);
        this.setPublicationstate(publicationstate);
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

    public String getPublicationstate() {
        return publicationstate;
    }

    public void setPublicationstate(String publicationstate) {
        this.publicationstate = publicationstate;
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

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
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
