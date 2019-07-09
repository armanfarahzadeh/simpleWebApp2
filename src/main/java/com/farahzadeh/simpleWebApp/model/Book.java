package com.farahzadeh.simpleWebApp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String isbn;
    private String publishers;

    @ManyToMany
    @JoinTable(name= "author_book", joinColumns=@JoinColumn(name="book_id"),inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors = new HashSet<>();

    public Book() {
    }

    public Book(String title, String isbn, String publishers) {
        this.title = title;
        this.isbn = isbn;
        this.publishers = publishers;

    }

    public Book(String title, String isbn, String publishers, Set<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.publishers = publishers;
        this.authors = authors;

    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublishers() {

        return publishers;
    }

    public void setPublishes(String publishers) {
        this.publishers = publishers;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

}
