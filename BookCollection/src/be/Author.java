package be;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Author {

    private IntegerProperty id;
    private StringProperty name;

    public Author(int id, String name)
    {
        setId(id);
        setName(name);
    }

    public Author(String name)
    {
        setName(name);
    }

    private void setName(String name) {
        this.getName();
    }

    private void setId(int id) {
        this.getId();
    }

    private String getName()
    {
        return name.get();
    }

    private int getId()
    {
        return id.get();
    }

}
