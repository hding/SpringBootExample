package au.gov.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import au.gov.library.entity.Book;
import au.gov.library.entity.Customer;
import au.gov.library.repository.BookRepository;
import au.gov.library.repository.CustomerRepository;

@Service
@Transactional
public class SearchService {

	@Autowired
	CustomerRepository userRepository;

	@Autowired
	BookRepository bookRepository;

	public Iterable<Customer> findAllCustomer() {
		return userRepository.findAll();
	}

	public Iterable<Book> findAllBook() {
		return bookRepository.findAll();
	}

	public Iterable<Book> findLentBook(Long id) {
		Customer cc = userRepository.findOne(id);
		List<Book> result = cc.getLentBookList();
		result.size();
		Iterable<Book> bookList = result;

		return bookList;
	}

}
