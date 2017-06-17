package pe.edu.utp.cuentahistorias.models;

/**
 * Created by usuario on 17/06/2017.
 */
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Category category;

    public User(int id, String firstName, String lastName, String email, String password, Category category) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPassword(password);
        this.setCategory(category);
    }

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Category getCategory() {
        return category;
    }

    public User setCategory(Category category) {
        this.category = category;
        return this;
    }
}
