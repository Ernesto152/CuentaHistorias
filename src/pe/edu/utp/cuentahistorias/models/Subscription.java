package pe.edu.utp.cuentahistorias.models;

import java.util.Date;

/**
 * Created by will on 17/06/2017.
 */
public class Subscription {
    private int id;
    private String email;
    private int cellPhone;
    private Date registrationDate;
    private String password;

    public Subscription() {
    }

    public Subscription(int id, String email, int cellPhone, Date registrationDate, String password) {
        this.setId(id);
        this.setEmail(email);
        this.setCellPhone(cellPhone);
        this.setRegistrationDate(registrationDate);
        this.setPassword(password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(int cellPhone) {
        this.cellPhone = cellPhone;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
