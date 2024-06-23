package name.nkonev.example.spring.data.jpa.json;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/book")
record BookController(
    BookRepository bookRepository
) {

    @PostExchange
    public Book post(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @PutExchange
    public Book put(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @PutExchange("/{id}")
    public Optional<Book> get(@PathVariable Long id) {
        return bookRepository.findById(id);
    }

    @GetExchange("/all")
    public Collection<Book> getAll() {
        return bookRepository.findAll();
    }
}
