package fi.tuni.BlogApp.BlogPost;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "blogPost")
public class BlogPost {

    @Id
    @GeneratedValue
    private long id;

    private String author;

    private String title;

    private String content;

    private LocalDateTime date;

    public BlogPost() {}

    public BlogPost(String author, String title, String content, LocalDateTime date) {
        this.author = author;
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
