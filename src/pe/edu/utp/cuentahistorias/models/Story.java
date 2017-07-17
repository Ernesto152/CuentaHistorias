package pe.edu.utp.cuentahistorias.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by will on 17/06/2017.
 */
public class Story {
    private int id;
    private String tittle;
    private String description;
    private Date publicationDate;
    private String imageUrl;
    private int like;
    private int dislike;
    private User user;

    public Story() {
    }

    public Story(int id, String tittle, String description, Date publicationDate, String imageUrl, int like, int dislike, User user) {
        this.id = id;
        this.tittle = tittle;
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

    public String getTittle() {
        return tittle;
    }

    public Story setTittle(String tittle) {
        this.tittle = tittle;
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
    public static Story build(ResultSet resultSet, UsersEntity usersEntity, SubscriptionsEntity subscriptionsEntity, EnterprisesEntity enterprisesEntity){
        try {
            return (new Story())
                    .setId(resultSet.getInt("id"))
                    .setTittle(resultSet.getString("title"))
                    .setDescription(resultSet.getString("description"))
                    .setPublicationDate(resultSet.getDate("publication_date"))
                    .setImageUrl(resultSet.getString("image_url"))
                    .setLike(resultSet.getInt("like"))
                    .setDislike(resultSet.getInt("dislike"))
                    .setUser(usersEntity.findById(resultSet.getInt(""),subscriptionsEntity, enterprisesEntity));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
