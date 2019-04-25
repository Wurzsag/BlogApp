package fi.tuni.BlogApp.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "blogPost")
public class User {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private boolean adminRights;

    public User() {
    }

    public User(String name, boolean adminRights) {
        this.name = name;
        this.adminRights = adminRights;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdminRights() {
        return adminRights;
    }

    public void setAdminRights(boolean adminRights) {
        this.adminRights = adminRights;
    }
}


