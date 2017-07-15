package pe.edu.utp.cuentahistorias.services;

import pe.edu.utp.cuentahistorias.models.CHDataStore;
import pe.edu.utp.cuentahistorias.models.User;
import pe.edu.utp.cuentahistorias.models.Word;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by usuario on 14/07/2017.
 */
public class CHService {
    Connection connection;
    CHDataStore dataStore;

    public CHService(InitialContext ctx) {
        try {
            connection = ((DataSource) ctx.lookup("jdbc/MySQLCHDataSource")).getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public CHService() {
        try {
            InitialContext ctx = new InitialContext();
            connection = ((DataSource) ctx.lookup("jdbc/MySQLCHDataSource")).getConnection();
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() {
        return connection;
    }

    private CHDataStore getDataStore(){
        if (dataStore == null){
            dataStore = new CHDataStore(getConnection());
        }
        return dataStore;
    }

    /*--------------------------------------------------------------*/
    public boolean createUser(User user){
        return getDataStore().createUser(user);
    }

    public List<Word> getWords(){
        return getDataStore().findAllWords();
    }

    public boolean createWord(Word word){
        return getDataStore().createWord(word);
    }
}
