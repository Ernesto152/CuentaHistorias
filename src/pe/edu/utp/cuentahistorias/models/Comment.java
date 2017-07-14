package pe.edu.utp.cuentahistorias.models;

import java.sql.Date;

/**
 * Created by will on 17/06/2017.
 */
public class Comment {
    private int id;
    private String description;
    private Date publicationDate;
    private User user;
    private Story story;

    public Comment() {
    }

    public Comment(int id, String description, Date publicationDate, User user, Story story) {
        this.id = id;
        this.description = description;
        this.publicationDate = publicationDate;
        this.user = user;
        this.story = story;
    }


    public int getId() {
        return id;
    }

    public Comment setId(int id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Comment setDescription(String description) {
        this.description = description;
        return this;
    }


    public Date getPublicationDate() {
        return publicationDate;
    }

    public Comment setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Comment setUser(User user) {
        this.user = user;
        return this;
    }

    public Story getStory() {
        return story;
    }

    public Comment setStory(Story story) {
        this.story = story;
        return this;
    }
}
