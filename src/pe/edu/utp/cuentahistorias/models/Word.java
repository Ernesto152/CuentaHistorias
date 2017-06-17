package pe.edu.utp.cuentahistorias.models;

/**
 * Created by will on 17/06/2017.
 */
public class Word {
    private int id;
    private String name;
    private int state;

    public Word() {
    }

    public Word(int id, String name, int state) {
        this.setId(id);
        this.setName(name);
        this.setState(state);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
