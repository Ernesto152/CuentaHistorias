package pe.edu.utp.cuentahistorias.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by will on 17/06/2017.
 */
public class Word {
    private int id;
    private String name;

    public Word() {
    }

    public Word(int id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public int getId() {
        return id;
    }

    public String getIdAsString(){
        return String.valueOf(getId());
    }

    public Word setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getNameAsValue(){
        return "'" + getName() + "'";
    }

    public Word setName(String name) {
        this.name = name;
        return this;
    }

    public static Word build(ResultSet resultSet){
        try {
            return (new Word())
                    .setId(resultSet.getInt("id"))
                    .setName(resultSet.getString("name"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
