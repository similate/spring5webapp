package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dlw on 12/29/2020
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
