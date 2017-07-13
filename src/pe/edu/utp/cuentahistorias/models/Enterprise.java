package pe.edu.utp.cuentahistorias.models;

/**
 * Created by Administrador on 13/07/2017.
 */
public class Enterprise {
    private int id;
    private int ruc;
    private String category;

    public Enterprise() {
    }

    public Enterprise (int id, int ruc, String category) {

        this.setId(id);
        this.setRuc(ruc);
        this.setCategory(category);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
