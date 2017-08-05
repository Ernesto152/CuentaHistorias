package pe.edu.utp.cuentahistorias.models;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

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

    public String getIdAsString(){
        return String.valueOf(getId());
    }
    public Comment setId(int id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public String getDescriptionAsValue(){
        return "'" + getDescription() + "'";
    }

    public Comment setDescription(String description) {
        this.description = description;
        return this;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public String getPublicationDateAsValue(){
        return "'" + getPublicationDate() + "'";
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

    public static Comment build(ResultSet resultSet, UsersEntity usersEntity, SubscriptionsEntity subscriptionsEntity,
                                EnterprisesEntity enterprisesEntity, StoriesEntity storiesEntity){
        try{
            return (new Comment())
                    .setId(resultSet.getInt("id"))
                    .setDescription(resultSet.getString("description"))
                    .setPublicationDate(resultSet.getDate("publication_date"))
                    .setUser(usersEntity.findById(resultSet.getInt("user_id"), subscriptionsEntity, enterprisesEntity))
                    .setStory(storiesEntity.findById(resultSet.getInt("story_id"), usersEntity, subscriptionsEntity, enterprisesEntity));
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
