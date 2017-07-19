package pe.edu.utp.cuentahistorias.models;

import java.sql.Connection;
import java.util.List;

/**
 * Created by usuario on 14/07/2017.
 */
public class CHDataStore {
    private Connection connection;
    private WordsEntity wordsEntity;
    private UsersEntity usersEntity;
    private StoriesEntity storiesEntity;
    private SubscriptionsEntity subscriptionsEntity;
    private EnterprisesEntity enterprisesEntity;

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

    private UsersEntity getUsersEntity(){
        if (usersEntity == null){
            usersEntity = new UsersEntity(getConnection());
        }
        return usersEntity;
    }

    public boolean createUser(User user){
        return getUsersEntity().add(user);
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

    /*------------------------------------------------*/

    public User findByName(String firstName, SubscriptionsEntity subscriptionsEntity, EnterprisesEntity enterprisesEntity){
        return getUsersEntity().findByFirstName(firstName, subscriptionsEntity, enterprisesEntity);
    }

    private SubscriptionsEntity getSubscriptionsEntity(){
        if (subscriptionsEntity == null){
            subscriptionsEntity = new SubscriptionsEntity(getConnection());
        }
        return subscriptionsEntity;
    }

    private EnterprisesEntity getEnterprisesEntity(){
        if (enterprisesEntity == null){
            enterprisesEntity = new EnterprisesEntity(getConnection());
        }
        return enterprisesEntity;
    }

    public Subscription findSubscription(int id){
        return getSubscriptionsEntity().findById(id);
    }

    public Enterprise findEnterprise(int id){
        return getEnterprisesEntity().findById(id, getSubscriptionsEntity());
    }

    private StoriesEntity getStoriesEntity(){
        if (storiesEntity == null){
            storiesEntity = new StoriesEntity(getConnection());
        }
        return storiesEntity;
    }
    public boolean createStory(Story story){
        return getStoriesEntity().add(story);
    }

    /*-------------------------------------------------------------------------------------*/
    public List<Word> randomWords(){
        return getWordsEntity().randomWords();
    }

    public List<Story> findAllStories(){
        return getStoriesEntity().findAll(getUsersEntity(), getSubscriptionsEntity(), getEnterprisesEntity());
    }
}
