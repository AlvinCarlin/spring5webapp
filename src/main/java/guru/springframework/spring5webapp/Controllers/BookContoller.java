package guru.springframework.spring5webapp.Controllers;

import org.springframework.stereotype.Controller;
import  org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import  guru.springframework.spring5webapp.Repositories.BookRepository;

@Controller
public class BookContoller {

    private  final BookRepository bookRepository;

    public BookContoller (guru.springframework.spring5webapp.repositories.BookRepository bookRepository){
        this.bookRepository =  bookRepository;

    }

    @RequestMapping("/books")
    public String GetBook(Model model){

        return "books";
    }

}
