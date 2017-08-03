package pe.edu.utp.cuentahistorias.actions;

import com.opensymphony.xwork2.ActionSupport;
import pe.edu.utp.cuentahistorias.models.Story;
import pe.edu.utp.cuentahistorias.models.User;
import pe.edu.utp.cuentahistorias.services.CHService;

import java.util.Date;

/**
 * Created by William on 15/07/2017.
 */
public class StoryAction extends ActionSupport {
    private int id;
    private String title;
    private String description;
    private Date publicationDate;
    private String imageUrl;
    private int like;
    private int dislike;
    private int user;
    private Story story;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }

    public String execute(){
        return SUCCESS;
    }

    public String add(){
        try {
            CHService service = new CHService();
            story = new Story(id, title, description, publicationDate, imageUrl, like, dislike, service.getUsersById(user));
            service.createStory(story);
            return SUCCESS;
        }catch (Exception e) {
            e.printStackTrace();
            return INPUT;
        }
    }

    public String details(){
        try {
            CHService service = new CHService();
            story = service.getStoriesById(id);
            id = story.getId();
            title = story.getTitle();
            description = story.getDescription();
            publicationDate = story.getPublicationDate();
            user = story.getUser().getId();
            return SUCCESS;
        }catch (Exception e) {
            e.printStackTrace();
            return INPUT;
        }
    }
}
