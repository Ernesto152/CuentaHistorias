package pe.edu.utp.cuentahistorias.models;

/**
 * Created by will on 17/06/2017.
 */
public class State {
    private String name;

    public State() {
    }

    public State(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
