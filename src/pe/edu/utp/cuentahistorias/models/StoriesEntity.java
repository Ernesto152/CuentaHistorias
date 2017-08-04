package pe.edu.utp.cuentahistorias.models;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Highlighter;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by will on 17/06/2017.
 */
public class StoriesEntity extends BaseEntity{

    public StoriesEntity(Connection connection) {
        super(connection, "stories");
    }

    public StoriesEntity() {
    }

    public List<Story> findAll(UsersEntity usersEntity, SubscriptionsEntity subscriptionsEntity, EnterprisesEntity enterprisesEntity){
        return findByCriteria("", usersEntity, subscriptionsEntity, enterprisesEntity);
    }

    public List<Story> findTheLatest(UsersEntity usersEntity, SubscriptionsEntity subscriptionsEntity, EnterprisesEntity enterprisesEntity){
        return findByCriteria(" true ORDER BY publication_date DESC LIMIT 8", usersEntity, subscriptionsEntity, enterprisesEntity);
    }

    public Story findById(int id, UsersEntity usersEntity, SubscriptionsEntity subscriptionsEntity, EnterprisesEntity enterprisesEntity){
        String criteria = " id = " + String.valueOf(id);
        return findByCriteria(criteria, usersEntity, subscriptionsEntity, enterprisesEntity).get(0);
    }

    public List<Story> findByCriteria(String criteria, UsersEntity usersEntity, SubscriptionsEntity subscriptionsEntity, EnterprisesEntity enterprisesEntity){
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Story> stories = new ArrayList<>();
        try {
            ResultSet resultSet  = getConnection().createStatement().executeQuery(sql);
            if (resultSet == null) return null;
            while (resultSet.next()){
                stories.add(Story.build(resultSet, usersEntity, subscriptionsEntity, enterprisesEntity));
            }
            return stories;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public boolean add(Story story){
        String sql = "INSERT INTO stories(title, description, publication_date, user_id) " +
                "VALUES(" +
                        story.getTitleAsValue() + ", " +
                        story.getDescriptionAsValue() + ", " +
                        "NOW(), " +
                        story.getUser().getIdAsString() + ")";
        return change(sql);
    }

}
