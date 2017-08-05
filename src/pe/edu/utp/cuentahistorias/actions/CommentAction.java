package pe.edu.utp.cuentahistorias.actions;

import com.opensymphony.xwork2.ActionSupport;
import pe.edu.utp.cuentahistorias.models.Comment;
import pe.edu.utp.cuentahistorias.services.CHService;

import java.sql.Date;

/**
 * Created by usuario on 05/08/2017.
 */
public class CommentAction extends ActionSupport{
    private int id;
    private String descriptions;
    private Date publicationDate;
    private int user;
    private int story;
    private Comment comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getStory() {
        return story;
    }

    public void setStory(int story) {
        this.story = story;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public String execute(){
        try {
            CHService service = new CHService();
        comment = new Comment(id, descriptions, publicationDate, service.getUsersById(user), service.getStoriesById(user));
        service.createComment(comment);
        return SUCCESS;
        }catch (Exception e) {
            e.printStackTrace();
            return INPUT;
        }
    }
}
