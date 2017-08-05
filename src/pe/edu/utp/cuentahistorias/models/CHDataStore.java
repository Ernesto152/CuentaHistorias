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
    private CommentsEntity commentsEntity;

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

    /*------------USERS -------------------------------------------------*/
    private UsersEntity getUsersEntity() {
        if (usersEntity == null) {
            usersEntity = new UsersEntity(getConnection());
        }
        return usersEntity;
    }

    public User findUsersById(int id) {
        return getUsersEntity().findById(id, getSubscriptionsEntity(), getEnterprisesEntity());
    }

    public User findByName(String firstName, SubscriptionsEntity subscriptionsEntity, EnterprisesEntity enterprisesEntity) {
        return getUsersEntity().findByFirstName(firstName, subscriptionsEntity, enterprisesEntity);
    }

    public List<User> findAllUsers() {
        return getUsersEntity().findAll(getSubscriptionsEntity(), getEnterprisesEntity());
    }

    public boolean createUser(User user) {
        return getUsersEntity().add(user);
    }

    public User findUsersByEmail(String email, String password){
        return getUsersEntity().findByEmail(email, password, getSubscriptionsEntity(), getEnterprisesEntity());
    }

    /*------------WORDS -------------------------------------------------*/
    private WordsEntity getWordsEntity() {
        if (wordsEntity == null) {
            wordsEntity = new WordsEntity(getConnection());
        }
        return wordsEntity;
    }

    public List<Word> findAllWords() {
        return getWordsEntity().findAll();
    }

    public boolean createWord(Word word) {
        return getWordsEntity().add(word);
    }

    public List<Word> randomWords() {
        return getWordsEntity().randomWords();
    }

//    public String validarPalabras(){return getStoriesEntity().buscarTexto();}
    /*------------SUBSCRIPTIONS -------------------------------------------------*/
    private SubscriptionsEntity getSubscriptionsEntity() {
        if (subscriptionsEntity == null) {
            subscriptionsEntity = new SubscriptionsEntity(getConnection());
        }
        return subscriptionsEntity;
    }

    public Subscription findSubscriptionsById(int id) {
        return getSubscriptionsEntity().findById(id);
    }

    /*------------ENTERPRISES -------------------------------------------------*/
    private EnterprisesEntity getEnterprisesEntity() {
        if (enterprisesEntity == null) {
            enterprisesEntity = new EnterprisesEntity(getConnection());
        }
        return enterprisesEntity;
    }

    public Enterprise findEnterprisesById(int id) {
        return getEnterprisesEntity().findById(id, getSubscriptionsEntity());
    }

    /*------------STORIES -------------------------------------------------*/
    private StoriesEntity getStoriesEntity() {
        if (storiesEntity == null) {
            storiesEntity = new StoriesEntity(getConnection());
        }
        return storiesEntity;
    }

    public Story findStoriesById(int id){
        return getStoriesEntity().findById(id, getUsersEntity(), getSubscriptionsEntity(), getEnterprisesEntity());
    }

    public boolean createStory(Story story) {
        return getStoriesEntity().add(story);
    }

    public List<Story> findAllStories() {
        return getStoriesEntity().findAll(getUsersEntity(), getSubscriptionsEntity(), getEnterprisesEntity());
    }

    public List<Story> findTheLatestStories(){
        return getStoriesEntity().findTheLatest(getUsersEntity(), getSubscriptionsEntity(), getEnterprisesEntity());
    }
    /*--------------COMMENTS-------------------------------------------------------*/
    private CommentsEntity getCommentsEntity(){
        if (commentsEntity == null){
            commentsEntity = new CommentsEntity(getConnection());
        }
        return commentsEntity;
    }

    public Comment findCommentsById(int id){
        return getCommentsEntity().findById(id, getUsersEntity(), getSubscriptionsEntity(), getEnterprisesEntity(), getStoriesEntity());
    }

    public boolean createComments(Comment comment){
        return getCommentsEntity().add(comment);
    }
}
