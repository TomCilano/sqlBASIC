package data;

/**
 * Created by Tom on 9/27/16.
 */
public class entries {
    private String title;
    private String text;
    private String creationDate;
    private int id;

    public entries(String title, String text, String creationDate, int id) {
        this.title = title;
        this.text = text;
        this.creationDate = creationDate;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

