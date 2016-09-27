package data;

import java.util.List;

/**
 * Created by Tom on 9/27/16.
 */
public class Blogs {

        private String title;
        private String creationDate;
        private int id;
        private List<entries> entries;

    public Blogs(String title, String creationDate, int id, List<data.entries> entries) {
        this.title = title;
        this.creationDate = creationDate;
        this.id = id;
        this.entries = entries;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public List<data.entries> getEntries() {
        return entries;
    }

    public void setEntries(List<data.entries> entries) {
        this.entries = entries;
    }
}

