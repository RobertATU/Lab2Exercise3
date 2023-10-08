package ie.atu.lab2_exercise3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Book {
    private String title;
    private String author;
    private int isbn;
    private int publishedYear;

}
