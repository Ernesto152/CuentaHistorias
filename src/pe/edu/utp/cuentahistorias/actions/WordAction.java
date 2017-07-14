package pe.edu.utp.cuentahistorias.actions;

import pe.edu.utp.cuentahistorias.models.Word;
import pe.edu.utp.cuentahistorias.services.CHService;

/**
 * Created by usuario on 14/07/2017.
 */
public class WordAction {
    private int id;
    private String name;
    private Word word;

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

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public String execute() {
        word = new Word(id, name);
        try {
            CHService chs = new CHService();
            chs.createWord(word);
            return "success";
        }catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
}
