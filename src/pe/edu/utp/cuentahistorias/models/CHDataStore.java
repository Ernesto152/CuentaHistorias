package pe.edu.utp.cuentahistorias.models;

import java.sql.Connection;
import java.util.List;

/**
 * Created by usuario on 14/07/2017.
 */
public class CHDataStore {
    private Connection connection;
    private WordsEntity wordsEntity;

    public CHDataStore(Connection connection) {
        this.connection = connection;
    }

    public CHDataStore() {
    }

    public Connection getConnection() {
        return connection;
    }

    public CHDataStore setConnection(Connection connection) {
        this.connection = connection;
        return this;
    }

    private WordsEntity getWordsEntity(){
        if (wordsEntity == null){
            wordsEntity = new WordsEntity(getConnection());
        }
        return wordsEntity;
    }

    public List<Word> findAllWords(){
        return getWordsEntity().findAll();
    }

    public boolean createWord(Word word){
        return getWordsEntity().add(word);
    }
}
