package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dlw on 12/29/2020
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
