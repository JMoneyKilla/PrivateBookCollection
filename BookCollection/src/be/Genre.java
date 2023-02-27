package be;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Genre {

    private IntegerProperty id;
    private SimpleStringProperty name;
    public Genre(int id, String name)
    {
        setId(id);
        setName(name);
    }

    private void setName(String name) {
        this.getName();
    }

    private String getName() {
        return name.get();
    }

    private void setId(int id) {
        this.getId();
    }

    private int getId() {
        return id.get();
    }
}
