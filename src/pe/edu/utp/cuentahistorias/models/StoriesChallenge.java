package pe.edu.utp.cuentahistorias.models;

/**
 * Created by usuario on 14/07/2017.
 */
public class StoriesChallenge {
    private Story story;
    private Challenge challenge;
    private int punctuation;

    public StoriesChallenge(Story story, Challenge challenge, int punctuation) {
        this.story = story;
        this.challenge = challenge;
        this.punctuation = punctuation;
    }

    public StoriesChallenge() {
    }

    public Story getStory() {
        return story;
    }

    public StoriesChallenge setStory(Story story) {
        this.story = story;
        return this;
    }

    public Challenge getChallenge() {
        return challenge;
    }

    public StoriesChallenge setChallenge(Challenge challenge) {
        this.challenge = challenge;
        return this;
    }

    public int getPunctuation() {
        return punctuation;
    }

    public StoriesChallenge setPunctuation(int punctuation) {
        this.punctuation = punctuation;
        return this;
    }
}
