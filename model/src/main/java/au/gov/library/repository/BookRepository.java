package au.gov.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import au.gov.library.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
