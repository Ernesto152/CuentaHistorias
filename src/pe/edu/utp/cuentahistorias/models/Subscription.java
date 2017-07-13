package pe.edu.utp.cuentahistorias.models;

import java.util.Date;

/**
 * Created by will on 17/06/2017.
 */
public class Subscription {
    private int id;
    private String name;
    private int price;
    private Date registrationdate;
    private Date expirationdate;
    private int amount;
    private String email;
    private int cellPhone;
    private String password;

    public Subscription() {
    }

    public Subscription(int id,String name, int price ,String email, int cellPhone, Date registrationdate, Date expirationdate, int amount, String password) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
        this.setRegistrationdate(registrationdate);
        this.setExpirationdate(expirationdate);
        this.setAmount(amount);
        this.setEmail(email);
        this.setCellPhone(cellPhone);
        this.setPassword(password);
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getRegistrationdate() {
        return registrationdate;
    }

    public void setRegistrationdate(Date registrationdate) {
        this.registrationdate = registrationdate;
    }

    public Date getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(Date expirationdate) {
        this.expirationdate = expirationdate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

