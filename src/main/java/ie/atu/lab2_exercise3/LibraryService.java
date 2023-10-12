package ie.atu.lab2_exercise3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {
    private List<Book> library = new ArrayList<>();
    public void addBook(Book book){
        System.out.println(book);
        library.add(book);
    }
    public List<Book> getBooks(){
        System.out.println(library);
        return library;
    }

}
