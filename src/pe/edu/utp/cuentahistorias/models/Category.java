package pe.edu.utp.cuentahistorias.models;

/**
 * Created by usuario on 17/06/2017.
 */
public class Category {
    private int id;
    private String name;
    private float price;

    public Category(int id, String name, float price) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
    }

    public Category() {
    }

    public int getId() {
        return id;
    }

    public Category setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Category setName(String name) {
        this.name = name;
        return this;
    }

    public float getPrice() {
        return price;
    }

    public Category setPrice(float price) {
        this.price = price;
        return this;
    }
}
