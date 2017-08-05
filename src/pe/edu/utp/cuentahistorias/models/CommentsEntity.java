package pe.edu.utp.cuentahistorias.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by will on 17/06/2017.
 */
public class CommentsEntity extends BaseEntity {
    public CommentsEntity(Connection connection) {
        super(connection, "comments");
    }

    public CommentsEntity() {
    }

    public List<Comment> findAll(String criteria, UsersEntity usersEntity, SubscriptionsEntity subscriptionsEntity,
                                 EnterprisesEntity enterprisesEntity, StoriesEntity storiesEntity){
        return findByCriteria("", usersEntity, subscriptionsEntity, enterprisesEntity, storiesEntity);
    }

    public Comment findById(int id, UsersEntity usersEntity, SubscriptionsEntity subscriptionsEntity,
                            EnterprisesEntity enterprisesEntity, StoriesEntity storiesEntity){
        String criteria = " id = " + String.valueOf(id);
        return findByCriteria(criteria, usersEntity, subscriptionsEntity, enterprisesEntity, storiesEntity).get(0);
    }

    public List<Comment> findByCriteria(String criteria, UsersEntity usersEntity, SubscriptionsEntity subscriptionsEntity,
                                        EnterprisesEntity enterprisesEntity, StoriesEntity storiesEntity){
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Comment> comments = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection().createStatement().executeQuery(sql);
            if (resultSet == null) return null;
            while (resultSet.next()){
                comments.add(Comment.build(resultSet, usersEntity, subscriptionsEntity, enterprisesEntity, storiesEntity));
            }
            return comments;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(Comment comment){
        String sql = "INSERT INTO comments(description, publication_date, user_id, story_id) " +
                "VALUES(" +
                    comment.getDescriptionAsValue() + ", " +
                    "NOW(), " +
                    comment.getUser().getIdAsString() +
                    comment.getStory().getIdAsString() + ")";
        return change(sql);
    }
    /*
    public boolean add(Story story){
        String sql = "INSERT INTO stories(title, description, publication_date, user_id) " +
                "VALUES(" +
                        story.getTitleAsValue() + ", " +
                        story.getDescriptionAsValue() + ", " +
                        "NOW(), " +
                        story.getUser().getIdAsString() + ")";
        return change(sql);
    }
     */
}
