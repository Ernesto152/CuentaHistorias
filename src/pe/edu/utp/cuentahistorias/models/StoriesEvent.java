package pe.edu.utp.cuentahistorias.models;

/**
 * Created by usuario on 14/07/2017.
 */
public class StoriesEvent {
    private Story story;
    private Event event;
    private int punctuation;

    public StoriesEvent(Story story, Event event, int punctuation) {
        this.story = story;
        this.event = event;
        this.punctuation = punctuation;
    }

    public StoriesEvent() {
    }

    public Story getStory() {
        return story;
    }

    public StoriesEvent setStory(Story story) {
        this.story = story;
        return this;
    }

    public Event getEvent() {
        return event;
    }

    public StoriesEvent setEvent(Event event) {
        this.event = event;
        return this;
    }

    public int getPunctuation() {
        return punctuation;
    }

    public StoriesEvent setPunctuation(int punctuation) {
        this.punctuation = punctuation;
        return this;
    }
}
