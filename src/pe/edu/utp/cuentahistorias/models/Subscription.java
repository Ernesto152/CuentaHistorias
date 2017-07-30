package pe.edu.utp.cuentahistorias.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by usuario on 17/06/2017.
 */
public class Subscription {
    private int id;
    private String name;
    private float price;
    private int duration;


    public Subscription() {
    }

    public Subscription(int id, String name, float price, int duration) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.duration = duration;
    }


    public int getId() {
        return id;
    }

    public String getIdAsString(){
        return String.valueOf(getId());
    }

    public Subscription setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getNameAsValue(){
        return "'" + getName() + "'";
    }

    public Subscription setName(String name) {
        this.name = name;
        return this;
    }

    public float getPrice() {
        return price;
    }

    public String getPriceAsString(){
        return String.valueOf(getPrice());
    }

    public Subscription setPrice(float price) {
        this.price = price;
        return this;
    }

    public int getDuration() {
        return duration;
    }

    public String getDurationAsString(){
        return String.valueOf(getDuration());
    }

    public Subscription setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public static Subscription build(ResultSet resultSet){
        try {
            return (new Subscription())
                    .setId(resultSet.getInt("id"))
                    .setName(resultSet.getString("name"))
                    .setPrice(resultSet.getFloat("price"))
                    .setDuration(resultSet.getInt("duration"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}
