package pe.edu.utp.cuentahistorias.models;

import java.sql.Date;

/**
 * Created by usuario on 13/07/2017.
 */
public class Challenge {
    private int id;
    private Date challengeDate;
    private User user;

    public Challenge(int id, Date challengeDate, User user) {
        this.id = id;
        this.challengeDate = challengeDate;
        this.user = user;
    }

    public Challenge() {
    }

    public int getId() {
        return id;
    }

    public Challenge setId(int id) {
        this.id = id;
        return this;
    }

    public Date getChallengeDate() {
        return challengeDate;
    }

    public Challenge setChallengeDate(Date challengeDate) {
        this.challengeDate = challengeDate;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Challenge setUser(User user) {
        this.user = user;
        return this;
    }
}
