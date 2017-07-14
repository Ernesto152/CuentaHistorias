package pe.edu.utp.cuentahistorias.models;

import java.util.Date;

/**
 * Created by will on 17/06/2017.
 */
public class Story {
    private int id;
    private String title;
    private String description;
    private Date publicationDate;
    private String imageUrl;
    private int like;
    private int dislike;
    private User user;

    public Story() {
    }

    public Story(int id, String title, String description, Date publicationDate, String imageUrl, int like, int dislike, User user) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.publicationDate = publicationDate;
        this.imageUrl = imageUrl;
        this.like = like;
        this.dislike = dislike;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public Story setId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Story setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Story setDescription(String description) {
        this.description = description;
        return this;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public Story setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Story setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public int getLike() {
        return like;
    }

    public Story setLike(int like) {
        this.like = like;
        return this;
    }

    public int getDislike() {
        return dislike;
    }

    public Story setDislike(int dislike) {
        this.dislike = dislike;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Story setUser(User user) {
        this.user = user;
        return this;
    }
}
