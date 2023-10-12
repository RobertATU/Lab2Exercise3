package ie.atu.lab2_exercise3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {
    private LibraryService libraryService;
    @Autowired
    public LibraryController(LibraryService libraryService){
        this.libraryService = libraryService;
    }
    @PostMapping("/addBook")
    @ResponseStatus(HttpStatus.CREATED)
    public void addToLibrary(@RequestBody Book book){
        libraryService.addBook(book);
    }
    @GetMapping("/getBooks")
    public List<Book> getBooks(){return libraryService.getBooks();}
}
