package pe.edu.utp.cuentahistorias.actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrador on 08/07/2017.
 */
public class PersonAction extends ActionSupport {
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String execute(){
        return SUCCESS;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void validate(){
        if (firstName == null || "".equalsIgnoreCase(firstName)){
            addFieldError("firstName", "First Name is required");
        }
        if (age < 17 || age > 65){
            addFieldError("age", "Age has to be in between 18 and 65");
        }
    }

}
