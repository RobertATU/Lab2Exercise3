package ie.atu.lab2_exercise3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
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
}
