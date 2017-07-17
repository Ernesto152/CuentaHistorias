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

    List<Story> findAll( SubscriptionsEntity subscriptionsEntity, EnterprisesEntity enterprisesEntity,UsersEntity usersEntity){
        return findByCriteria("", subscriptionsEntity, enterprisesEntity, usersEntity);
    }
    public Story findById(int id,SubscriptionsEntity subscriptionsEntity, EnterprisesEntity enterprisesEntity, UsersEntity usersEntity){
        String criteria = " id = " + id;
        return findByCriteria(criteria, subscriptionsEntity, enterprisesEntity,usersEntity).get(0);
    }

    public Story findByTittle(String title,SubscriptionsEntity subscriptionsEntity, EnterprisesEntity enterprisesEntity, UsersEntity usersEntity){
        String criteria = " tittle = '" + title + "'";
        return findByCriteria(criteria, subscriptionsEntity, enterprisesEntity,usersEntity).get(0);
    }

    public List<Story> findByCriteria(String criteria, SubscriptionsEntity subscriptionsEntity,EnterprisesEntity enterprisesEntity, UsersEntity usersEntity){
        String sql = getDefaultQuery() + (criteria.equalsIgnoreCase("") ? "" : " WHERE " + criteria);
        List<Story> stories = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection().createStatement().executeQuery(sql);
            if (resultSet == null) return null;
            while (resultSet.next()){
                stories.add(Story.build(resultSet,usersEntity, subscriptionsEntity, enterprisesEntity));
            }
            return stories;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(Story story){
        String sql = "INSERT INTO stories(title, description, publication_date, image_url, `like`, `dislike`, user_id)" +
                " VALUES( '" +story.getTittle() + "' , '" + story.getDescription() + "', " + " CURDATE()" + ", " + story.getImageUrl() + ", " +
                story.getLike() + ", " + story.getDislike() + ", 1 )";
        return change(sql);
    }
    /*public boolean add2(Story story){
        String sql = "INSERT INTO stories(title, description, publication_date, image_url, `like`, `dislike`, user_id)" +
                " VALUES( 'bla' , 'bla2',  CURDATE() , null , 1 , 1 , 1)";
        return change(sql);
    }*/


}
