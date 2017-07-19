package pe.edu.utp.cuentahistorias.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by will on 17/06/2017.
 */
public class WordsEntity extends BaseEntity{
    public WordsEntity(Connection connection) {
        super(connection, "words");
    }

    public WordsEntity() {
    }

    List<Word> findAll(){
        return findByCriteria("");
    }

    public Word findById(int id){
        String criteria = " id = " + String.valueOf(id);
        return findByCriteria(criteria).get(0);
    }

    public Word findByName(String name){
        String criteria = " name = '" + name + "'";
        return findByCriteria(criteria).get(0);
    }

    public List<Word> findByCriteria(String criteria){
        String sql = getDefaultQuery() + (criteria.equalsIgnoreCase("") ? "" : " WHERE " + criteria);
        List<Word> words = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection().createStatement().executeQuery(sql);
            if (resultSet == null) return null;
            while (resultSet.next()){
                words.add(Word.build(resultSet));
            }
            return words;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(Word word){
        String sql = "INSERT INTO words (id, name) " +
                "VALUES(" + word.getIdAsString() + ", " +
                            word.getNameAsValue() + ")";
        return change(sql);
    }

    public List<Word> randomWords(){
        return findByCriteria("true ORDER BY RAND() LIMIT 5");
    }
}
