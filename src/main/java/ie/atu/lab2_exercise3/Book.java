package ie.atu.lab2_exercise3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//Step 1 says to include getters and setters

public class Book {
    private String name;
    private String email;
    private int isbn;
    private int publishedYear;

    public Book(String name, String email, int isbn, int publishedYear) {
        this.name = name;
        this.email = email;
        this.isbn = isbn;
        this.publishedYear = publishedYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", isbn=" + isbn +
                ", publishedYear=" + publishedYear +
                '}';
    }
}
