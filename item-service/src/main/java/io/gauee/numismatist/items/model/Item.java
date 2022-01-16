package io.gauee.numismatist.items.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    private String id;
    private String name;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item withId(String id) {
        this.id = id;
        return this;
    }

    public Item withName(String name) {
        this.name = name;
        return this;
    }
}
