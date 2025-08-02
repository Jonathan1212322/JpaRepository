package sv.edu.udb.desafio1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.desafio1.repository.domain.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainingIgnoreCase(String title);
}