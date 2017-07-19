package pe.edu.utp.cuentahistorias.models;

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
        String sql = "INSERT INTO stories(title, description, publication_date, image_url, like, dislike, user_id)" +
                " VALUES( '" +
                story.getTitle() + "' , '" +
                story.getDescription() + "', " +
                " CURDATE()" + ", " +
                story.getImageUrl() + ", " +
                story.getLike() + ", " +
                story.getDislike() +
                ", 1 )";
        return change(sql);
    }


    /*public boolean add(Story story){
        String sql = "INSERT INTO stories(title, description, publication_date, user_id" +
                " VALUES(" +
                story.getTitleAsValue() + ", " +
                story.getDescriptionAsValue() + ", " +
                "CURDATE(), " +
                "1)";
        return change(sql);
    }*/
    /*
    INSERT INTO
            stories(title, description, publication_date, user_id)
            VALUES('Primera historia',
            'El arte de la microhistoria Luis González y González El Colegio de Michoacán DESLINDE
            Aunque acepté con gusto la invitación de presentar una ponencia sobre teoría y método de la
            microhistoria, me acerco a ustedes con temor.',
            CURDATE(),
            2)
     */
}
