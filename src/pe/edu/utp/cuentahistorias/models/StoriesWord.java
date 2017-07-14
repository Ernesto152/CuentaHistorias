package pe.edu.utp.cuentahistorias.models;

/**
 * Created by usuario on 14/07/2017.
 */
public class StoriesWord {
    private Story story;
    private Word word;

    public StoriesWord(Story story, Word word) {
        this.story = story;
        this.word = word;
    }

    public StoriesWord() {
    }

    public Story getStory() {
        return story;
    }

    public StoriesWord setStory(Story story) {
        this.story = story;
        return this;
    }

    public Word getWord() {
        return word;
    }

    public StoriesWord setWord(Word word) {
        this.word = word;
        return this;
    }
}
